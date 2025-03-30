// ProductViewModel.kt
package com.example.shopapp.ui.products

import com.example.shopapp.data.repository.CartRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopapp.data.model.ApiResponse
import com.example.shopapp.data.model.Product
import com.example.shopapp.data.repository.ProductRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import kotlinx.coroutines.job

class ProductViewModel(
    private val productRepository: ProductRepository,
    private val cartRepository: CartRepository
) : ViewModel() {
    // Cache for products by category - using MutableStateFlow for each category
    private val allProductsCache = MutableStateFlow<ApiResponse<List<Product>>>(ApiResponse.Loading)
    private val electronicsCache = MutableStateFlow<ApiResponse<List<Product>>>(ApiResponse.Loading)
    private val clothingCache = MutableStateFlow<ApiResponse<List<Product>>>(ApiResponse.Loading)
    private val jeweleryCache = MutableStateFlow<ApiResponse<List<Product>>>(ApiResponse.Loading)
    
    // Current active category
    private val _selectedCategory = MutableStateFlow<String?>(null)
    val selectedCategory: StateFlow<String?> = _selectedCategory
    
    // Currently displayed products
    private val _productsState = MutableStateFlow<ApiResponse<List<Product>>>(ApiResponse.Loading)
    val productsState: StateFlow<ApiResponse<List<Product>>> = _productsState
    
    // Flags to track initial loads
    private var allLoaded = false
    private var electronicsLoaded = false
    private var clothingLoaded = false
    private var jeweleryLoaded = false
    
    // Initialize
    init {
        loadProducts()
    }
    
    fun loadProducts() {
        _selectedCategory.value = null
        _productsState.value = allProductsCache.value
        
        if (!allLoaded) {
            allLoaded = true
            viewModelScope.launch {
                productRepository.getProducts()
                    .catch { e ->
                        allProductsCache.value = ApiResponse.Error("Failed to load products: ${e.message}")
                        _productsState.value = allProductsCache.value
                    }
                    .collect { response ->
                        allProductsCache.value = response
                        if (_selectedCategory.value == null) {
                            _productsState.value = response
                        }
                    }
            }
        }
    }
    
    fun loadProductsByCategory(category: String) {
        _selectedCategory.value = category
        
        when (category.lowercase()) {
            "electronics" -> {
                _productsState.value = electronicsCache.value
                if (!electronicsLoaded) {
                    electronicsLoaded = true
                    fetchCategory("electronics", electronicsCache)
                }
            }
            "clothing" -> {
                // Start with loading state
                _productsState.value = ApiResponse.Loading
                
                if (clothingLoaded && clothingCache.value is ApiResponse.Success) {
                    // Use cached data if available
                    _productsState.value = clothingCache.value
                } else {
                    // Fetch men's clothing only since it works
                    clothingLoaded = true
                    viewModelScope.launch {
                        try {
                            productRepository.getProductsByCategory("men's clothing")
                                .collect { response ->
                                    when (response) {
                                        is ApiResponse.Success -> {
                                            clothingCache.value = response
                                            if (_selectedCategory.value == "clothing") {
                                                _productsState.value = response
                                            }
                                        }
                                        is ApiResponse.Error -> {
                                            clothingCache.value = ApiResponse.Error("Failed to load clothing items")
                                            if (_selectedCategory.value == "clothing") {
                                                _productsState.value = clothingCache.value
                                            }
                                        }
                                        is ApiResponse.Loading -> {
                                            // Keep loading state
                                        }
                                    }
                                }
                        } catch (e: Exception) {
                            clothingCache.value = ApiResponse.Error("Error: ${e.message}")
                            if (_selectedCategory.value == "clothing") {
                                _productsState.value = clothingCache.value
                            }
                        }
                    }
                }
            }
            "jewelery" -> {
                _productsState.value = jeweleryCache.value
                if (!jeweleryLoaded) {
                    jeweleryLoaded = true
                    fetchCategory("jewelery", jeweleryCache)
                }
            }
            else -> loadProducts()
        }
    }
    
    private fun fetchCategory(category: String, cacheFlow: MutableStateFlow<ApiResponse<List<Product>>>) {
        viewModelScope.launch {
            productRepository.getProductsByCategory(category)
                .catch { e ->
                    cacheFlow.value = ApiResponse.Error("Failed to load: ${e.message}")
                    if (_selectedCategory.value == category) {
                        _productsState.value = cacheFlow.value
                    }
                }
                .collect { response ->
                    cacheFlow.value = response
                    if (_selectedCategory.value == category) {
                        _productsState.value = response
                    }
                }
        }
    }
    
    fun clearCategoryFilter() {
        loadProducts()
    }
    
    fun addToCart(product: Product) {
        viewModelScope.launch {
            cartRepository.addToCart(product)
        }
    }
}