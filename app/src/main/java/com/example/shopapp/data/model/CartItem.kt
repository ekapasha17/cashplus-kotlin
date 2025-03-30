// CartItem.kt
package com.example.shopapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart_items")
data class CartItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val productId: Int,
    val productName: String,
    val quantity: Int,
    val price: Double,
    val imageUrl: String
) {
    val totalPrice: Double
        get() = quantity * price
}