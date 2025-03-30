package com.example.shopapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000fJ\u0019\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/shopapp/data/repository/CartRepository;", "", "cartDao", "Lcom/example/shopapp/data/db/CartDao;", "(Lcom/example/shopapp/data/db/CartDao;)V", "addToCart", "", "product", "Lcom/example/shopapp/data/model/Product;", "quantity", "", "(Lcom/example/shopapp/data/model/Product;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/shopapp/data/model/CartItem;", "getCartItemCount", "getTotalCartPrice", "", "removeFromCart", "cartItem", "(Lcom/example/shopapp/data/model/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCartItemQuantity", "(Lcom/example/shopapp/data/model/CartItem;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CartRepository {
    private final com.example.shopapp.data.db.CartDao cartDao = null;
    
    public CartRepository(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.db.CartDao cartDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.CartItem>> getAllCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addToCart(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.Product product, int quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateCartItemQuantity(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem, int quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object removeFromCart(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearCart(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getTotalCartPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getCartItemCount() {
        return null;
    }
}