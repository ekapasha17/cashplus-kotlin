package com.example.shopapp.ui.cart

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shopapp.R

public class CartFragmentDirections private constructor() {
  public companion object {
    public fun actionCartFragmentToCheckoutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_cartFragment_to_checkoutFragment)
  }
}
