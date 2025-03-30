// CheckoutFragment.kt
package com.example.shopapp.ui.checkout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.shopapp.databinding.FragmentCheckoutBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.NumberFormat
import java.util.Locale

class CheckoutFragment : Fragment() {

    private var _binding: FragmentCheckoutBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CheckoutViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCheckoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupCustomerInfoInputs()
        setupPlaceOrderButton()
        observeViewModel()
        observeCartData()
    }

    private fun setupCustomerInfoInputs() {
        // Sync EditText values with ViewModel
        binding.editName.doAfterTextChanged {
            viewModel.customerName.value = it.toString()
        }

        binding.editEmail.doAfterTextChanged {
            viewModel.customerEmail.value = it.toString()
        }

        binding.editAddress.doAfterTextChanged {
            viewModel.customerAddress.value = it.toString()
        }
    }

    private fun setupPlaceOrderButton() {
        binding.buttonPlaceOrder.setOnClickListener {
            try {
                // Validate inputs before proceeding
                if (binding.editName.text.isNullOrBlank() || 
                    binding.editEmail.text.isNullOrBlank() || 
                    binding.editAddress.text.isNullOrBlank()) {
                    
                    binding.textError.visibility = View.VISIBLE
                    binding.textError.text = "Please fill in all required fields"
                    return@setOnClickListener
                }
                
                viewModel.placeOrder()
            } catch (e: Exception) {
                // Show error and log it
                binding.textError.visibility = View.VISIBLE
                binding.textError.text = "Error: ${e.message ?: "Unknown error"}"
                e.printStackTrace()
            }
        }
    }

    private fun observeViewModel() {
        // Observe order status
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.orderStatus.collectLatest { status ->
                when (status) {
                    is CheckoutViewModel.OrderStatus.Initial -> {
                        // Initial state, no UI changes needed
                        binding.progressBar.visibility = View.GONE
                        binding.textError.visibility = View.GONE
                        binding.buttonPlaceOrder.isEnabled = true
                    }
                    is CheckoutViewModel.OrderStatus.Loading -> {
                        binding.progressBar.visibility = View.VISIBLE
                        binding.textError.visibility = View.GONE
                        binding.buttonPlaceOrder.isEnabled = false
                    }
                    is CheckoutViewModel.OrderStatus.Success -> {
                        binding.progressBar.visibility = View.GONE
                        binding.textError.visibility = View.GONE
                        // Navigation will be handled by the navigation event
                    }
                    is CheckoutViewModel.OrderStatus.Error -> {
                        binding.progressBar.visibility = View.GONE
                        binding.textError.visibility = View.VISIBLE
                        binding.textError.text = status.message
                        binding.buttonPlaceOrder.isEnabled = true
                    }
                }
            }
        }

        // Observe navigation events
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.navigationEvent.collectLatest { event ->
                when (event) {
                    is CheckoutViewModel.NavigationEvent.NavigateToOrderConfirmation -> {
                        findNavController().navigate(
                            CheckoutFragmentDirections.actionCheckoutFragmentToOrderConfirmationFragment(
                                event.orderId
                            )
                        )
                    }
                }
            }
        }
    }

    private fun observeCartData() {
        // For simplicity, we're using hardcoded values for the order summary
        // In a real app, you would get this from the CartViewModel
        binding.textItemsCount.text = "3 items"
        binding.textSubtotal.text = formatPrice(99.97)
        binding.textShipping.text = formatPrice(5.99)
        binding.textTotal.text = formatPrice(105.96)
    }

    private fun formatPrice(price: Double): String {
        return NumberFormat.getCurrencyInstance(Locale.US).format(price)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}