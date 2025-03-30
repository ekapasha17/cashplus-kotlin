package com.example.shopapp.ui.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\fJ\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/shopapp/ui/cart/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "cartRepository", "Lcom/example/shopapp/data/repository/CartRepository;", "productRepository", "Lcom/example/shopapp/data/repository/ProductRepository;", "(Lcom/example/shopapp/data/repository/CartRepository;Lcom/example/shopapp/data/repository/ProductRepository;)V", "_cartItemCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_cartItems", "", "Lcom/example/shopapp/data/model/CartItem;", "_cartTotal", "", "cartItemCount", "Lkotlinx/coroutines/flow/StateFlow;", "getCartItemCount", "()Lkotlinx/coroutines/flow/StateFlow;", "cartItems", "getCartItems", "cartTotal", "getCartTotal", "addToCart", "", "product", "Lcom/example/shopapp/data/model/Product;", "quantity", "clearCart", "removeFromCart", "cartItem", "updateCartItemQuantity", "app_debug"})
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.shopapp.data.repository.CartRepository cartRepository = null;
    private final com.example.shopapp.data.repository.ProductRepository productRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.shopapp.data.model.CartItem>> _cartItems = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.shopapp.data.model.CartItem>> cartItems = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> _cartTotal = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> cartTotal = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _cartItemCount = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> cartItemCount = null;
    
    public CartViewModel(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.CartRepository cartRepository, @org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.shopapp.data.model.CartItem>> getCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getCartTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCartItemCount() {
        return null;
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.Product product, int quantity) {
    }
    
    public final void updateCartItemQuantity(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem, int quantity) {
    }
    
    public final void removeFromCart(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem) {
    }
    
    public final void clearCart() {
    }
}