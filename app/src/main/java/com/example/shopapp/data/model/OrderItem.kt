// OrderItem.kt
package com.example.shopapp.data.model

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "order_items",
    primaryKeys = ["orderId", "productId"],
    foreignKeys = [
        ForeignKey(
            entity = Order::class,
            parentColumns = ["id"],
            childColumns = ["orderId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class OrderItem(
    val orderId: Int,
    val productId: Int,
    val productName: String,
    val quantity: Int,
    val price: Double
)