// ProductRepositoryTest.kt
package com.example.shopapp.repository

import com.example.shopapp.data.api.ProductApi
import com.example.shopapp.data.db.ProductDao
import com.example.shopapp.data.model.ApiResponse
import com.example.shopapp.data.model.Product
import com.example.shopapp.data.repository.ProductRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class ProductRepositoryTest {

    @Mock
    private lateinit var productApi: ProductApi

    @Mock
    private lateinit var productDao: ProductDao

    private lateinit var productRepository: ProductRepository

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        productRepository = ProductRepository(productApi, productDao)
    }

    @Test
    fun `getProducts returns cached data when available`() = runTest {
        // Given: Database has cached products
        val cachedProducts = listOf(
            Product(1, "Test Product 1", "Description 1", 9.99, "url1", "category1"),
            Product(2, "Test Product 2", "Description 2", 19.99, "url2", "category2")
        )
        
        `when`(productDao.getAllProducts()).thenReturn(flowOf(cachedProducts))

        // When: Repository's getProducts is called
        val result = productRepository.getProducts().first()

        // Then: Cached products are returned as success
        assertTrue(result is ApiResponse.Success)
        assertEquals(cachedProducts, (result as ApiResponse.Success).data)
    }

    @Test
    fun `getProductById returns product from database when available`() = runTest {
        // Given: Product exists in database
        val productId = 1
        val product = Product(productId, "Test Product", "Description", 9.99, "url", "category")
        
        `when`(productDao.getProductById(productId)).thenReturn(product)

        // When: Repository's getProductById is called
        val result = productRepository.getProductById(productId)

        // Then: Product from database is returned
        assertEquals(product, result)
    }
}

// CartViewModelTest.kt
package com.example.shopapp.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.shopapp.data.model.CartItem
import com.example.shopapp.data.model.Product
import com.example.shopapp.data.repository.CartRepository
import com.example.shopapp.data.repository.ProductRepository
import com.example.shopapp.ui.cart.CartViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class CartViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val testDispatcher = UnconfinedTestDispatcher()

    @Mock
    private lateinit var cartRepository: CartRepository

    @Mock
    private lateinit var productRepository: ProductRepository

    private lateinit var cartViewModel: CartViewModel

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        Dispatchers.setMain(testDispatcher)
        
        // Mock the repository's flow emissions
        `when`(cartRepository.getAllCartItems()).thenReturn(flowOf(emptyList()))
        `when`(cartRepository.getTotalCartPrice()).thenReturn(flowOf(0.0))
        `when`(cartRepository.getCartItemCount()).thenReturn(flowOf(0))
        
        cartViewModel = CartViewModel(cartRepository, productRepository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `addToCart calls repository's addToCart method`() = runTest {
        // Given: A product
        val product = Product(1, "Test Product", "Description", 9.99, "url", "category")
        
        // When: ViewModel's addToCart is called
        cartViewModel.addToCart(product)
        
        // Then: Repository's addToCart is called with the product
        verify(cartRepository, times(1)).addToCart(product, 1)
    }

    @Test
    fun `updateCartItemQuantity calls repository's updateCartItemQuantity method`() = runTest {
        // Given: A cart item
        val cartItem = CartItem(1, 1, "Test Product", 1, 9.99, "url")
        val newQuantity = 2
        
        // When: ViewModel's updateCartItemQuantity is called
        cartViewModel.updateCartItemQuantity(cartItem, newQuantity)
        
        // Then: Repository's updateCartItemQuantity is called with the cart item and new quantity
        verify(cartRepository, times(1)).updateCartItemQuantity(cartItem, newQuantity)
    }

    @Test
    fun `removeFromCart calls repository's removeFromCart method`() = runTest {
        // Given: A cart item
        val cartItem = CartItem(1, 1, "Test Product", 1, 9.99, "url")
        
        // When: ViewModel's removeFromCart is called
        cartViewModel.removeFromCart(cartItem)
        
        // Then: Repository's removeFromCart is called with the cart item
        verify(cartRepository, times(1)).removeFromCart(cartItem)
    }

    @Test
    fun `clearCart calls repository's clearCart method`() = runTest {
        // When: ViewModel's clearCart is called
        cartViewModel.clearCart()
        
        // Then: Repository's clearCart is called
        verify(cartRepository, times(1)).clearCart()
    }
}