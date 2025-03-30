package com.example.shopapp.ui.products

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shopapp.R

public class ProductListFragmentDirections private constructor() {
  public companion object {
    public fun actionProductListFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productListFragment_to_cartFragment)
  }
}
