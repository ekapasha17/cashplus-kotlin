// GetProductsUseCase.kt
package com.example.shopapp.domain.usecase

import com.example.shopapp.data.model.ApiResponse
import com.example.shopapp.data.model.Product
import com.example.shopapp.data.repository.ProductRepository
import kotlinx.coroutines.flow.Flow

class GetProductsUseCase(private val productRepository: ProductRepository) {
    
    // Get all products
    operator fun invoke(): Flow<ApiResponse<List<Product>>> {
        return productRepository.getProducts()
    }
    
    // Get products by category
    fun getByCategory(category: String): Flow<ApiResponse<List<Product>>> {
        return productRepository.getProductsByCategory(category)
    }
    
    // Get product by ID
    suspend fun getById(productId: Int): Product? {
        return productRepository.getProductById(productId)
    }
}