package com.example.shopapp.ui.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0012\u0013BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/shopapp/ui/cart/CartAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/shopapp/data/model/CartItem;", "Lcom/example/shopapp/ui/cart/CartAdapter$CartViewHolder;", "onItemRemove", "Lkotlin/Function1;", "", "onQuantityIncrease", "onQuantityDecrease", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CartDiffCallback", "CartViewHolder", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.shopapp.data.model.CartItem, com.example.shopapp.ui.cart.CartAdapter.CartViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.shopapp.data.model.CartItem, kotlin.Unit> onItemRemove = null;
    private final kotlin.jvm.functions.Function1<com.example.shopapp.data.model.CartItem, kotlin.Unit> onQuantityIncrease = null;
    private final kotlin.jvm.functions.Function1<com.example.shopapp.data.model.CartItem, kotlin.Unit> onQuantityDecrease = null;
    
    public CartAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.shopapp.data.model.CartItem, kotlin.Unit> onItemRemove, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.shopapp.data.model.CartItem, kotlin.Unit> onQuantityIncrease, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.shopapp.data.model.CartItem, kotlin.Unit> onQuantityDecrease) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.shopapp.ui.cart.CartAdapter.CartViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.shopapp.ui.cart.CartAdapter.CartViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/shopapp/ui/cart/CartAdapter$CartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/shopapp/databinding/ItemCartBinding;", "(Lcom/example/shopapp/ui/cart/CartAdapter;Lcom/example/shopapp/databinding/ItemCartBinding;)V", "bind", "", "cartItem", "Lcom/example/shopapp/data/model/CartItem;", "formatPrice", "", "price", "", "app_debug"})
    public final class CartViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.shopapp.databinding.ItemCartBinding binding = null;
        
        public CartViewHolder(@org.jetbrains.annotations.NotNull
        com.example.shopapp.databinding.ItemCartBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.shopapp.data.model.CartItem cartItem) {
        }
        
        private final java.lang.String formatPrice(double price) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/shopapp/ui/cart/CartAdapter$CartDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/shopapp/data/model/CartItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class CartDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.shopapp.data.model.CartItem> {
        
        public CartDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.shopapp.data.model.CartItem oldItem, @org.jetbrains.annotations.NotNull
        com.example.shopapp.data.model.CartItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.shopapp.data.model.CartItem oldItem, @org.jetbrains.annotations.NotNull
        com.example.shopapp.data.model.CartItem newItem) {
            return false;
        }
    }
}