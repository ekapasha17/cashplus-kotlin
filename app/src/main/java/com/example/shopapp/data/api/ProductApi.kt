// ProductApi.kt
package com.example.shopapp.data.api

import com.example.shopapp.data.model.ApiProduct
import com.example.shopapp.data.model.Product
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.concurrent.TimeUnit

// This interface defines our API endpoints
interface ProductApi {
    @GET("products")
    suspend fun getProducts(): List<ApiProduct>
    
    @GET("products/{id}")
    suspend fun getProductById(@Path("id") productId: Int): ApiProduct

    @GET("products/category/{category}")
    suspend fun getProductsByCategory(@Path("category") category: String): List<ApiProduct>
    
    companion object {
        // We're using a sample API for demo purposes
        private const val BASE_URL = "https://fakestoreapi.com/"
        
        fun create(): ProductApi {
            val logger = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
            
            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build()
            
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ProductApi::class.java)
        }
    }
}