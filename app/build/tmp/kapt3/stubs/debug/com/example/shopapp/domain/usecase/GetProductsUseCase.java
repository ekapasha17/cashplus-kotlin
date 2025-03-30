package com.example.shopapp.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/shopapp/domain/usecase/GetProductsUseCase;", "", "productRepository", "Lcom/example/shopapp/data/repository/ProductRepository;", "(Lcom/example/shopapp/data/repository/ProductRepository;)V", "getByCategory", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/shopapp/data/model/ApiResponse;", "", "Lcom/example/shopapp/data/model/Product;", "category", "", "getById", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "app_debug"})
public final class GetProductsUseCase {
    private final com.example.shopapp.data.repository.ProductRepository productRepository = null;
    
    public GetProductsUseCase(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> invoke() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> getByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getById(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shopapp.data.model.Product> continuation) {
        return null;
    }
}