// OrderDao.kt
package com.example.shopapp.data.db

import androidx.room.*
import com.example.shopapp.data.model.Order
import com.example.shopapp.data.model.OrderItem
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrder(order: Order): Long
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrderItems(orderItems: List<OrderItem>)
    
    @Query("SELECT * FROM orders ORDER BY orderDate DESC")
    fun getAllOrders(): Flow<List<Order>>
    
    @Query("SELECT * FROM order_items WHERE orderId = :orderId")
    suspend fun getOrderItemsForOrder(orderId: Int): List<OrderItem>
}