package com.example.shopapp.ui.checkout

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.shopapp.R
import kotlin.Int
import kotlin.Long

public class CheckoutFragmentDirections private constructor() {
  private data class ActionCheckoutFragmentToOrderConfirmationFragment(
    public val orderId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_checkoutFragment_to_orderConfirmationFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        return result
      }
  }

  public companion object {
    public fun actionCheckoutFragmentToOrderConfirmationFragment(orderId: Long): NavDirections =
        ActionCheckoutFragmentToOrderConfirmationFragment(orderId)
  }
}
