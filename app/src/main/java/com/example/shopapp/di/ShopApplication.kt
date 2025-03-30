// ShopApplication.kt
package com.example.shopapp

import android.app.Application
import com.example.shopapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class ShopApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Koin
        startKoin {
            androidLogger(Level.ERROR) // Use ERROR level to avoid Koin issues on newer Android versions
            androidContext(this@ShopApplication)
            modules(appModule)
        }
    }
}