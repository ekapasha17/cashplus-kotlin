package com.example.shopapp.data.model

data class ApiProduct(
    val id: Int?,
    val title: String?, // Note: API uses "title" not "name"
    val price: Double?,
    val description: String?,
    val category: String?,
    val image: String?
)