// ProductAdapter.kt
package com.example.shopapp.ui.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shopapp.data.model.Product
import com.example.shopapp.databinding.ItemProductBinding
import java.text.NumberFormat
import java.util.Locale

class ProductAdapter(private val onProductClick: (Product) -> Unit) :
    ListAdapter<Product, ProductAdapter.ProductViewHolder>(ProductDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = getItem(position)
        holder.bind(product)
    }

    inner class ProductViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.buttonAddToCart.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onProductClick(getItem(position))
                }
            }
        }

        fun bind(product: Product) {
            binding.apply {
                textProductName.text = product.name
                textProductPrice.text = formatPrice(product.price)
                
                // Load product image
                Glide.with(imageProduct.context)
                    .load(product.imageUrl)
                    .centerCrop()
                    .into(imageProduct)
            }
        }

        private fun formatPrice(price: Double): String {
            return NumberFormat.getCurrencyInstance(Locale.US).format(price)
        }
    }

    private class ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            // More strict comparison to avoid unnecessary redraws
            return oldItem.id == newItem.id && 
                oldItem.name == newItem.name &&
                oldItem.price == newItem.price
        }
    }
}