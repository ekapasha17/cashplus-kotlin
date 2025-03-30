// Product.kt
package com.example.shopapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey val id: Int,
    val name: String = "", // Default empty string instead of null
    val description: String = "",
    val price: Double = 0.0,
    val imageUrl: String = "",
    val category: String = ""
)