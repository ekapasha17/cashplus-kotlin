// AddToCartUseCase.kt
package com.example.shopapp.domain.usecase

import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.model.Product
import com.example.shopapp.data.repository.CartRepository
import kotlinx.coroutines.flow.Flow

class AddToCartUseCase(private val cartRepository: CartRepository) {
    
    // Add product to cart
    suspend operator fun invoke(product: Product, quantity: Int = 1) {
        cartRepository.addToCart(product, quantity)
    }
    
    // Get all cart items
    fun getCartItems(): Flow<List<CartItem>> {
        return cartRepository.getAllCartItems()
    }
    
    // Update cart item quantity
    suspend fun updateQuantity(cartItem: CartItem, quantity: Int) {
        cartRepository.updateCartItemQuantity(cartItem, quantity)
    }
    
    // Remove from cart
    suspend fun removeFromCart(cartItem: CartItem) {
        cartRepository.removeFromCart(cartItem)
    }
    
    // Get cart total
    fun getCartTotal(): Flow<Double?> {
        return cartRepository.getTotalCartPrice()
    }
    
    // Get cart item count
    fun getCartItemCount(): Flow<Int> {
        return cartRepository.getCartItemCount()
    }
}