// CheckoutViewModel.kt
package com.example.shopapp.ui.checkout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.repository.CartRepository
import com.example.shopapp.data.repository.OrderRepository
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class CheckoutViewModel(
    private val cartRepository: CartRepository,
    private val orderRepository: OrderRepository
) : ViewModel() {
    // Customer information
    val customerName = MutableStateFlow("")
    val customerEmail = MutableStateFlow("")
    val customerAddress = MutableStateFlow("")
    
    // Order status
    private val _orderStatus = MutableStateFlow<OrderStatus>(OrderStatus.Initial)
    val orderStatus: StateFlow<OrderStatus> = _orderStatus
    
    // One-time event for navigation
    private val _navigationEvent = MutableSharedFlow<NavigationEvent>()
    val navigationEvent: SharedFlow<NavigationEvent> = _navigationEvent
    
    // Function to place an order
    fun placeOrder() {
        // Set status to loading
        _orderStatus.value = OrderStatus.Loading
        
        viewModelScope.launch {
            try {
                // Validate customer information
                if (customerName.value.isBlank() || customerEmail.value.isBlank() || customerAddress.value.isBlank()) {
                    _orderStatus.value = OrderStatus.Error("Please fill in all customer information")
                    return@launch
                }
                
                // Get cart items and total with safety checks
                val cartItems = try {
                    cartRepository.getAllCartItems().first()
                } catch (e: Exception) {
                    _orderStatus.value = OrderStatus.Error("Failed to retrieve cart items: ${e.message}")
                    return@launch
                }
                
                if (cartItems.isEmpty()) {
                    _orderStatus.value = OrderStatus.Error("Your cart is empty")
                    return@launch
                }
                
                val cartTotal = try {
                    cartRepository.getTotalCartPrice().first() ?: 0.0
                } catch (e: Exception) {
                    _orderStatus.value = OrderStatus.Error("Failed to calculate cart total: ${e.message}")
                    return@launch
                }
                
                // Create the order with safety
                val orderId = try {
                    orderRepository.createOrder(
                        cartItems = cartItems,
                        customerName = customerName.value,
                        customerEmail = customerEmail.value,
                        customerAddress = customerAddress.value,
                        totalAmount = cartTotal
                    )
                } catch (e: Exception) {
                    _orderStatus.value = OrderStatus.Error("Failed to create order: ${e.message}")
                    e.printStackTrace()
                    return@launch
                }
                
                // Clear the cart with safety
                try {
                    cartRepository.clearCart()
                } catch (e: Exception) {
                    // Don't fail the order if cart clearing fails
                    android.util.Log.e("CHECKOUT", "Failed to clear cart: ${e.message}")
                }
                
                // Update status to success
                _orderStatus.value = OrderStatus.Success(orderId)
                
                // Try to emit navigation event
                try {
                    _navigationEvent.emit(NavigationEvent.NavigateToOrderConfirmation(orderId))
                } catch (e: Exception) {
                    android.util.Log.e("CHECKOUT", "Navigation failed: ${e.message}")
                    // Order is still successful even if navigation fails
                }
            } catch (e: Exception) {
                // Catch any other unexpected errors
                _orderStatus.value = OrderStatus.Error("Unexpected error: ${e.message}")
                e.printStackTrace()
            }
        }
    }
    
    // Reset the checkout form
    fun resetCheckout() {
        customerName.value = ""
        customerEmail.value = ""
        customerAddress.value = ""
        _orderStatus.value = OrderStatus.Initial
    }
    
    // Order status sealed class
    sealed class OrderStatus {
        object Initial : OrderStatus()
        object Loading : OrderStatus()
        data class Success(val orderId: Long) : OrderStatus()
        data class Error(val message: String) : OrderStatus()
    }
    
    // Navigation event sealed class
    sealed class NavigationEvent {
        data class NavigateToOrderConfirmation(val orderId: Long) : NavigationEvent()
    }
}