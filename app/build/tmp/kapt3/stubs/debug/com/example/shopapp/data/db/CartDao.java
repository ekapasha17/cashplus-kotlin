package com.example.shopapp.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u001b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\'J\u0010\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\nH\'J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/shopapp/data/db/CartDao;", "", "clearCart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartItem", "cartItem", "Lcom/example/shopapp/data/model/CartItem;", "(Lcom/example/shopapp/data/model/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "Lkotlinx/coroutines/flow/Flow;", "", "getCartItemByProductId", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartItemCount", "getTotalCartPrice", "", "insertCartItem", "updateCartItem", "app_debug"})
public abstract interface CartDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM cart_items")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.CartItem>> getAllCartItems();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM cart_items WHERE productId = :productId")
    public abstract java.lang.Object getCartItemByProductId(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shopapp.data.model.CartItem> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertCartItem(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateCartItem(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteCartItem(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM cart_items")
    public abstract java.lang.Object clearCart(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT SUM(quantity * price) FROM cart_items")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Double> getTotalCartPrice();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT(*) FROM cart_items")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getCartItemCount();
}