// Order.kt
package com.example.shopapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "orders")
data class Order(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val customerName: String,
    val customerEmail: String,
    val customerAddress: String,
    val totalAmount: Double,
    val orderDate: Date = Date()
)