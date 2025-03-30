// MainActivity.kt
package com.example.shopapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.shopapp.R
import com.example.shopapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // Connect bottom navigation with navigation controller
        binding.bottomNavigation.setupWithNavController(navController)
        
        // Add manual click handling to ensure navigation works
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_products -> {
                    navController.navigate(R.id.productListFragment)
                    true
                }
                R.id.navigation_cart -> {
                    navController.navigate(R.id.cartFragment)
                    true
                }
                else -> false
            }
        }
    }
}