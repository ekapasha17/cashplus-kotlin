// CartRepository.kt
package com.example.shopapp.data.repository

import com.example.shopapp.data.db.CartDao
import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class CartRepository(private val cartDao: CartDao) {
    // Get all cart items
    fun getAllCartItems(): Flow<List<CartItem>> = cartDao.getAllCartItems()
    
    // Add product to cart
    suspend fun addToCart(product: Product, quantity: Int = 1) {
        withContext(Dispatchers.IO) {
            val existingItem = cartDao.getCartItemByProductId(product.id)
            
            if (existingItem != null) {
                // If item already in cart, update quantity
                val updatedItem = existingItem.copy(quantity = existingItem.quantity + quantity)
                cartDao.updateCartItem(updatedItem)
            } else {
                // Otherwise, add new item
                val cartItem = CartItem(
                    productId = product.id,
                    productName = product.name,
                    quantity = quantity,
                    price = product.price,
                    imageUrl = product.imageUrl
                )
                cartDao.insertCartItem(cartItem)
            }
        }
    }
    
    // Update cart item quantity
    suspend fun updateCartItemQuantity(cartItem: CartItem, quantity: Int) {
        withContext(Dispatchers.IO) {
            if (quantity <= 0) {
                cartDao.deleteCartItem(cartItem)
            } else {
                val updatedItem = cartItem.copy(quantity = quantity)
                cartDao.updateCartItem(updatedItem)
            }
        }
    }
    
    // Remove item from cart
    suspend fun removeFromCart(cartItem: CartItem) {
        withContext(Dispatchers.IO) {
            cartDao.deleteCartItem(cartItem)
        }
    }
    
    // Clear cart
    suspend fun clearCart() {
        withContext(Dispatchers.IO) {
            cartDao.clearCart()
        }
    }
    
    // Get total cart price
    fun getTotalCartPrice(): Flow<Double?> = cartDao.getTotalCartPrice()
    
    // Get cart item count
    fun getCartItemCount(): Flow<Int> = cartDao.getCartItemCount()
}