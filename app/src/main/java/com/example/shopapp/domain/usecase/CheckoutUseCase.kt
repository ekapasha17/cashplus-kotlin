// CheckoutUseCase.kt
package com.example.shopapp.domain.usecase

import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.model.Order
import com.example.shopapp.data.repository.CartRepository
import com.example.shopapp.data.repository.OrderRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first

class CheckoutUseCase(
    private val cartRepository: CartRepository,
    private val orderRepository: OrderRepository
) {
    
    // Create an order from the current cart
    suspend operator fun invoke(
        customerName: String,
        customerEmail: String,
        customerAddress: String
    ): Long {
        // Get cart items and total
        val cartItems = cartRepository.getAllCartItems().first()
        val cartTotal = cartRepository.getTotalCartPrice().first() ?: 0.0
        
        if (cartItems.isEmpty()) {
            throw IllegalStateException("Cannot checkout with empty cart")
        }
        
        // Create order
        val orderId = orderRepository.createOrder(
            cartItems = cartItems,
            customerName = customerName,
            customerEmail = customerEmail,
            customerAddress = customerAddress,
            totalAmount = cartTotal
        )
        
        // Clear cart after successful order
        cartRepository.clearCart()
        
        return orderId
    }
    
    // Get all orders
    fun getOrders(): Flow<List<Order>> {
        return orderRepository.getAllOrders()
    }
}