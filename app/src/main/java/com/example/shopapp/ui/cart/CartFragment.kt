// CartFragment.kt
package com.example.shopapp.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.shopapp.databinding.FragmentCartBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.NumberFormat
import java.util.Locale

class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CartViewModel by viewModel()
    private lateinit var cartAdapter: CartAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        setupCheckoutButton()
        observeViewModel()
    }

    private fun setupRecyclerView() {
        cartAdapter = CartAdapter(
            onItemRemove = { cartItem ->
                viewModel.removeFromCart(cartItem)
            },
            onQuantityIncrease = { cartItem ->
                viewModel.updateCartItemQuantity(cartItem, cartItem.quantity + 1)
            },
            onQuantityDecrease = { cartItem ->
                if (cartItem.quantity > 1) {
                    viewModel.updateCartItemQuantity(cartItem, cartItem.quantity - 1)
                } else {
                    viewModel.removeFromCart(cartItem)
                }
            }
        )
        binding.recyclerView.adapter = cartAdapter
    }

    private fun setupCheckoutButton() {
        binding.buttonCheckout.setOnClickListener {
            findNavController().navigate(
                CartFragmentDirections.actionCartFragmentToCheckoutFragment()
            )
        }
    }

    private fun observeViewModel() {
        // Observe cart items
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.cartItems.collectLatest { items ->
                cartAdapter.submitList(items)
                updateEmptyCartVisibility(items.isEmpty())
            }
        }

        // Observe cart total
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.cartTotal.collectLatest { total ->
                binding.textTotal.text = formatPrice(total)
                binding.buttonCheckout.isEnabled = total > 0
            }
        }
    }

    private fun updateEmptyCartVisibility(isEmpty: Boolean) {
        if (isEmpty) {
            binding.recyclerView.visibility = View.GONE
            binding.textEmptyCart.visibility = View.VISIBLE
            binding.layoutCartSummary.visibility = View.GONE
        } else {
            binding.recyclerView.visibility = View.VISIBLE
            binding.textEmptyCart.visibility = View.GONE
            binding.layoutCartSummary.visibility = View.VISIBLE
        }
    }

    private fun formatPrice(price: Double): String {
        return NumberFormat.getCurrencyInstance(Locale.US).format(price)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}