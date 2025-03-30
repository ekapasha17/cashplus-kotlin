// ProductListFragment.kt
package com.example.shopapp.ui.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.shopapp.data.model.ApiResponse
import com.example.shopapp.databinding.FragmentProductListBinding
import com.google.android.material.chip.Chip
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProductListFragment : Fragment() {

    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ProductViewModel by viewModel()
    private lateinit var productAdapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        setupCategoryChips()
        observeViewModel()
    }

    private fun setupRecyclerView() {
        productAdapter = ProductAdapter { product ->
            // Add to cart functionality
            viewModel.addToCart(product)
            Toast.makeText(
                requireContext(),
                "${product.name} added to cart",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.recyclerView.adapter = productAdapter
    }

    private fun setupCategoryChips() {
        binding.chipAll.setOnClickListener {
            viewModel.clearCategoryFilter()
        }

        binding.chipElectronics.setOnClickListener {
            viewModel.loadProductsByCategory("electronics")
        }

        binding.chipClothing.setOnClickListener {
            viewModel.loadProductsByCategory("clothing")
        }

        binding.chipJewelery.setOnClickListener {
            viewModel.loadProductsByCategory("jewelery")
        }
    }

    // In ProductListFragment.kt - update the observeViewModel method
    private fun observeViewModel() {
        // Use launchWhenStarted instead of regular launch to prevent collection when not visible
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.productsState.collectLatest { response ->
                when (response) {
                    is ApiResponse.Loading -> {
                        binding.progressBar.visibility = View.VISIBLE
                        binding.textError.visibility = View.GONE
                    }
                    is ApiResponse.Success -> {
                        binding.progressBar.visibility = View.GONE
                        binding.textError.visibility = View.GONE
                        // Only update adapter if data actually changed
                        if (productAdapter.currentList != response.data) {
                            productAdapter.submitList(response.data)
                        }
                    }
                    is ApiResponse.Error -> {
                        binding.progressBar.visibility = View.GONE
                        binding.textError.visibility = View.VISIBLE
                        binding.textError.text = response.message
                    }
                }
            }
        }

        // Observe selected category separately 
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.selectedCategory.collectLatest { category ->
                updateSelectedCategoryChip(category)
            }
        }
    }

    private fun updateSelectedCategoryChip(category: String?) {
        binding.chipAll.isChecked = category == null
        binding.chipElectronics.isChecked = category == "electronics"
        binding.chipClothing.isChecked = category == "clothing"
        binding.chipJewelery.isChecked = category == "jewelery"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}