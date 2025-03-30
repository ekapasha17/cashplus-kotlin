// NetworkModule.kt
package com.example.shopapp.di

import com.example.shopapp.data.api.ProductApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    // Provide OkHttpClient
    single {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
    }
    
    // Provide Retrofit
    single {
        Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    
    // Provide ProductApi
    single {
        get<Retrofit>().create(ProductApi::class.java)
    }
}