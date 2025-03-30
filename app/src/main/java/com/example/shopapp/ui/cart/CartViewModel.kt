// CartViewModel.kt
package com.example.shopapp.ui.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.model.Product
import com.example.shopapp.data.repository.CartRepository
import com.example.shopapp.data.repository.ProductRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class CartViewModel(
    private val cartRepository: CartRepository,
    private val productRepository: ProductRepository
) : ViewModel() {
    // StateFlow to hold the cart items
    private val _cartItems = MutableStateFlow<List<CartItem>>(emptyList())
    val cartItems: StateFlow<List<CartItem>> = _cartItems
    
    // StateFlow to hold the cart total
    private val _cartTotal = MutableStateFlow(0.0)
    val cartTotal: StateFlow<Double> = _cartTotal
    
    // StateFlow to hold the cart item count
    private val _cartItemCount = MutableStateFlow(0)
    val cartItemCount: StateFlow<Int> = _cartItemCount
    
    // Initialize and collect cart data
    init {
        // Collect cart items
        viewModelScope.launch {
            cartRepository.getAllCartItems().collectLatest { items ->
                _cartItems.value = items
            }
        }
        
        // Collect cart total
        viewModelScope.launch {
            cartRepository.getTotalCartPrice().collectLatest { total ->
                _cartTotal.value = total ?: 0.0
            }
        }
        
        // Collect cart item count
        viewModelScope.launch {
            cartRepository.getCartItemCount().collectLatest { count ->
                _cartItemCount.value = count
            }
        }
    }
    
    // Function to add a product to the cart
    fun addToCart(product: Product, quantity: Int = 1) {
        viewModelScope.launch {
            cartRepository.addToCart(product, quantity)
        }
    }
    
    // Function to update cart item quantity
    fun updateCartItemQuantity(cartItem: CartItem, quantity: Int) {
        viewModelScope.launch {
            cartRepository.updateCartItemQuantity(cartItem, quantity)
        }
    }
    
    // Function to remove an item from the cart
    fun removeFromCart(cartItem: CartItem) {
        viewModelScope.launch {
            cartRepository.removeFromCart(cartItem)
        }
    }
    
    // Function to clear the cart
    fun clearCart() {
        viewModelScope.launch {
            cartRepository.clearCart()
        }
    }
}