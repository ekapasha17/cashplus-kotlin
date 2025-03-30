package com.example.shopapp.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006J\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006J#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/shopapp/domain/usecase/AddToCartUseCase;", "", "cartRepository", "Lcom/example/shopapp/data/repository/CartRepository;", "(Lcom/example/shopapp/data/repository/CartRepository;)V", "getCartItemCount", "Lkotlinx/coroutines/flow/Flow;", "", "getCartItems", "", "Lcom/example/shopapp/data/model/CartItem;", "getCartTotal", "", "invoke", "", "product", "Lcom/example/shopapp/data/model/Product;", "quantity", "(Lcom/example/shopapp/data/model/Product;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromCart", "cartItem", "(Lcom/example/shopapp/data/model/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuantity", "(Lcom/example/shopapp/data/model/CartItem;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AddToCartUseCase {
    private final com.example.shopapp.data.repository.CartRepository cartRepository = null;
    
    public AddToCartUseCase(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.CartRepository cartRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.Product product, int quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.CartItem>> getCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateQuantity(@org.jetbrains.annotations.NotNull
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
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getCartTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getCartItemCount() {
        return null;
    }
}