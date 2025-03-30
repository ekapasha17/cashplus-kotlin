package com.example.shopapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e0\rJ \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/shopapp/data/repository/ProductRepository;", "", "productApi", "Lcom/example/shopapp/data/api/ProductApi;", "productDao", "Lcom/example/shopapp/data/db/ProductDao;", "(Lcom/example/shopapp/data/api/ProductApi;Lcom/example/shopapp/data/db/ProductDao;)V", "getProductById", "Lcom/example/shopapp/data/model/Product;", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/shopapp/data/model/ApiResponse;", "", "getProductsByCategory", "category", "", "mapApiResponseToProduct", "apiProduct", "Lcom/example/shopapp/data/model/ApiProduct;", "mapApiResponseToProducts", "apiProducts", "app_debug"})
public final class ProductRepository {
    private final com.example.shopapp.data.api.ProductApi productApi = null;
    private final com.example.shopapp.data.db.ProductDao productDao = null;
    
    public ProductRepository(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.api.ProductApi productApi, @org.jetbrains.annotations.NotNull
    com.example.shopapp.data.db.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProductById(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shopapp.data.model.Product> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> getProductsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    private final com.example.shopapp.data.model.Product mapApiResponseToProduct(com.example.shopapp.data.model.ApiProduct apiProduct) {
        return null;
    }
    
    private final java.util.List<com.example.shopapp.data.model.Product> mapApiResponseToProducts(java.util.List<com.example.shopapp.data.model.ApiProduct> apiProducts) {
        return null;
    }
}