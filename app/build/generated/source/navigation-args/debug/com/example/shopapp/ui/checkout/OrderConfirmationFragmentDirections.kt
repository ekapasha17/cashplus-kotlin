package com.example.shopapp.ui.checkout

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shopapp.R

public class OrderConfirmationFragmentDirections private constructor() {
  public companion object {
    public fun actionOrderConfirmationFragmentToProductListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderConfirmationFragment_to_productListFragment)
  }
}
