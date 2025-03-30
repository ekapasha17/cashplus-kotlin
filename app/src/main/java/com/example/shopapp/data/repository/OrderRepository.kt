// OrderRepository.kt
package com.example.shopapp.data.repository

import com.example.shopapp.data.db.OrderDao
import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.model.Order
import com.example.shopapp.data.model.OrderItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class OrderRepository(private val orderDao: OrderDao) {
    // Create a new order from cart items
    suspend fun createOrder(
        cartItems: List<CartItem>,
        customerName: String,
        customerEmail: String,
        customerAddress: String,
        totalAmount: Double
    ): Long {
        return withContext(Dispatchers.IO) {
            // Create the order
            val order = Order(
                customerName = customerName,
                customerEmail = customerEmail,
                customerAddress = customerAddress,
                totalAmount = totalAmount
            )
            
            // Insert the order and get the generated ID
            val orderId = orderDao.insertOrder(order)
            
            // Create order items from cart items
            val orderItems = cartItems.map { cartItem ->
                OrderItem(
                    orderId = orderId.toInt(),
                    productId = cartItem.productId,
                    productName = cartItem.productName,
                    quantity = cartItem.quantity,
                    price = cartItem.price
                )
            }
            
            // Insert order items
            orderDao.insertOrderItems(orderItems)
            
            orderId
        }
    }
    
    // Get all orders
    fun getAllOrders(): Flow<List<Order>> = orderDao.getAllOrders()
    
    // Get items for a specific order
    suspend fun getOrderItems(orderId: Int): List<OrderItem> {
        return withContext(Dispatchers.IO) {
            orderDao.getOrderItemsForOrder(orderId)
        }
    }
}