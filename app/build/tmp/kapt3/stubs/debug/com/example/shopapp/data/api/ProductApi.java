package com.example.shopapp.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/shopapp/data/api/ProductApi;", "", "getProductById", "Lcom/example/shopapp/data/model/ApiProduct;", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsByCategory", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ProductApi {
    @org.jetbrains.annotations.NotNull
    public static final com.example.shopapp.data.api.ProductApi.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "products")
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.shopapp.data.model.ApiProduct>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "products/{id}")
    public abstract java.lang.Object getProductById(@retrofit2.http.Path(value = "id")
    int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shopapp.data.model.ApiProduct> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "products/category/{category}")
    public abstract java.lang.Object getProductsByCategory(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.shopapp.data.model.ApiProduct>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/shopapp/data/api/ProductApi$Companion;", "", "()V", "BASE_URL", "", "create", "Lcom/example/shopapp/data/api/ProductApi;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "https://fakestoreapi.com/";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.shopapp.data.api.ProductApi create() {
            return null;
        }
    }
}