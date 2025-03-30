// CartAdapter.kt
package com.example.shopapp.ui.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shopapp.data.model.CartItem
import com.example.shopapp.databinding.ItemCartBinding
import java.text.NumberFormat
import java.util.Locale

class CartAdapter(
    private val onItemRemove: (CartItem) -> Unit,
    private val onQuantityIncrease: (CartItem) -> Unit,
    private val onQuantityDecrease: (CartItem) -> Unit
) : ListAdapter<CartItem, CartAdapter.CartViewHolder>(CartDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = ItemCartBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val cartItem = getItem(position)
        holder.bind(cartItem)
    }

    inner class CartViewHolder(private val binding: ItemCartBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.buttonRemove.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemRemove(getItem(position))
                }
            }

            binding.buttonIncrease.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onQuantityIncrease(getItem(position))
                }
            }

            binding.buttonDecrease.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onQuantityDecrease(getItem(position))
                }
            }
        }

        fun bind(cartItem: CartItem) {
            binding.apply {
                textProductName.text = cartItem.productName
                textProductPrice.text = formatPrice(cartItem.price)
                textQuantity.text = cartItem.quantity.toString()

                // Load product image
                Glide.with(imageProduct.context)
                    .load(cartItem.imageUrl)
                    .centerCrop()
                    .into(imageProduct)
            }
        }

        private fun formatPrice(price: Double): String {
            return NumberFormat.getCurrencyInstance(Locale.US).format(price)
        }
    }

    private class CartDiffCallback : DiffUtil.ItemCallback<CartItem>() {
        override fun areItemsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
            return oldItem == newItem
        }
    }
}