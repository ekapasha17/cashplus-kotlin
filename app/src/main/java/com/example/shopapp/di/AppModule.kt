// AppModule.kt
package com.example.shopapp.di

import com.example.shopapp.data.api.ProductApi
import com.example.shopapp.data.db.AppDatabase
import com.example.shopapp.data.repository.CartRepository
import com.example.shopapp.data.repository.OrderRepository
import com.example.shopapp.data.repository.ProductRepository
import com.example.shopapp.ui.cart.CartViewModel
import com.example.shopapp.ui.checkout.CheckoutViewModel
import com.example.shopapp.ui.products.ProductViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // Database
    single { AppDatabase.getDatabase(androidContext()) }
    single { get<AppDatabase>().productDao() }
    single { get<AppDatabase>().cartDao() }
    single { get<AppDatabase>().orderDao() }
    
    // API
    single { ProductApi.create() }
    
    // Repositories
    single { ProductRepository(get(), get()) }
    single { CartRepository(get()) }
    single { OrderRepository(get()) }
    
    // ViewModels
    viewModel { ProductViewModel(get(), get()) }
    viewModel { CartViewModel(get(), get()) }
    viewModel { CheckoutViewModel(get(), get()) }
}