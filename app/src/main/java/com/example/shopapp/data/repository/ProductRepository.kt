// ProductRepository.kt
package com.example.shopapp.data.repository

import com.example.shopapp.data.model.ApiProduct
import com.example.shopapp.data.api.ProductApi
import com.example.shopapp.data.db.ProductDao
import com.example.shopapp.data.model.ApiResponse
import com.example.shopapp.data.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext

class ProductRepository(
    private val productApi: ProductApi,
    private val productDao: ProductDao
) {
    // Get all products with network + cache strategy
    fun getProducts(): Flow<ApiResponse<List<Product>>> = flow {
        emit(ApiResponse.Loading)
        
        // First, emit cached data from the database
        productDao.getAllProducts().collect { cachedProducts ->
            if (cachedProducts.isNotEmpty()) {
                emit(ApiResponse.Success(cachedProducts))
            }
            
            // Then, fetch fresh data from the API
            try {
                val remoteProducts = mapApiResponseToProducts(productApi.getProducts())

                // Log categories for debugging
                val categories = remoteProducts.map { it.category }.toSet()
                android.util.Log.d("CATEGORIES_DEBUG", "Available categories: $categories")

                withContext(Dispatchers.IO) {
                    productDao.insertAll(remoteProducts)
                }
                emit(ApiResponse.Success(remoteProducts))
            } catch (e: Exception) {
                // If we failed to fetch but have cache, we already emitted it
                // If we have no cache, emit error
                if (cachedProducts.isEmpty()) {
                    emit(ApiResponse.Error("Failed to fetch products: ${e.message}"))
                }
            }
        }
    }.flowOn(Dispatchers.IO)
    
    // Get product by ID
    suspend fun getProductById(productId: Int): Product? {
        return withContext(Dispatchers.IO) {
            // First try to get from local database
            val localProduct = productDao.getProductById(productId)
            
            // If not in database, fetch from API and save
            if (localProduct == null) {
                try {
                    val remoteProduct = mapApiResponseToProduct(productApi.getProductById(productId))
                    productDao.insertAll(listOf(remoteProduct))
                    remoteProduct
                } catch (e: Exception) {
                    null
                }
            } else {
                localProduct
            }
        }
    }
    
    // Get products by category
    fun getProductsByCategory(category: String): Flow<ApiResponse<List<Product>>> = flow {
        emit(ApiResponse.Loading)
        
        // Similar strategy as getProducts, but filtered by category
        productDao.getProductsByCategory(category).collect { cachedProducts ->
            if (cachedProducts.isNotEmpty()) {
                emit(ApiResponse.Success(cachedProducts))
            }
            
            try {
                val remoteProducts = mapApiResponseToProducts(productApi.getProductsByCategory(category))
                withContext(Dispatchers.IO) {
                    productDao.insertAll(remoteProducts)
                }
                emit(ApiResponse.Success(remoteProducts))
            } catch (e: Exception) {
                if (cachedProducts.isEmpty()) {
                    emit(ApiResponse.Error("Failed to fetch products: ${e.message}"))
                }
            }
        }
    }.flowOn(Dispatchers.IO)

    private fun mapApiResponseToProduct(apiProduct: ApiProduct): Product {
        return Product(
            id = apiProduct.id ?: 0,
            name = apiProduct.title ?: "",
            description = apiProduct.description ?: "",
            price = apiProduct.price ?: 0.0,
            imageUrl = apiProduct.image ?: "",
            category = apiProduct.category ?: ""
        )
    }

    private fun mapApiResponseToProducts(apiProducts: List<ApiProduct>): List<Product> {
        return apiProducts.map { mapApiResponseToProduct(it) }
    }
}