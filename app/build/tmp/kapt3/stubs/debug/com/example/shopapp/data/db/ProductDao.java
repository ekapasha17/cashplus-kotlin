package com.example.shopapp.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/shopapp/data/db/ProductDao;", "", "getAllProducts", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/shopapp/data/model/Product;", "getProductById", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsByCategory", "category", "", "insertAll", "", "products", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM products")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.Product>> getAllProducts();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM products WHERE id = :productId")
    public abstract java.lang.Object getProductById(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shopapp.data.model.Product> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.shopapp.data.model.Product> products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM products WHERE category = :category")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.Product>> getProductsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
}