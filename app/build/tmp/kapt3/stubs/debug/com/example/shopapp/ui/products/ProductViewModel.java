package com.example.shopapp.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000bJ\u0006\u0010 \u001a\u00020\u001eJ*\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\r2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0002J\u0006\u0010$\u001a\u00020\u001eJ\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\rR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/example/shopapp/ui/products/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/example/shopapp/data/repository/ProductRepository;", "cartRepository", "Lcom/example/shopapp/data/repository/CartRepository;", "(Lcom/example/shopapp/data/repository/ProductRepository;Lcom/example/shopapp/data/repository/CartRepository;)V", "_productsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/shopapp/data/model/ApiResponse;", "", "Lcom/example/shopapp/data/model/Product;", "_selectedCategory", "", "allLoaded", "", "allProductsCache", "clothingCache", "clothingLoaded", "electronicsCache", "electronicsLoaded", "jeweleryCache", "jeweleryLoaded", "productsState", "Lkotlinx/coroutines/flow/StateFlow;", "getProductsState", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedCategory", "getSelectedCategory", "addToCart", "", "product", "clearCategoryFilter", "fetchCategory", "category", "cacheFlow", "loadProducts", "loadProductsByCategory", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.shopapp.data.repository.ProductRepository productRepository = null;
    private final com.example.shopapp.data.repository.CartRepository cartRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> allProductsCache = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> electronicsCache = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> clothingCache = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> jeweleryCache = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _selectedCategory = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedCategory = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> _productsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> productsState = null;
    private boolean allLoaded = false;
    private boolean electronicsLoaded = false;
    private boolean clothingLoaded = false;
    private boolean jeweleryLoaded = false;
    
    public ProductViewModel(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.CartRepository cartRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> getProductsState() {
        return null;
    }
    
    public final void loadProducts() {
    }
    
    public final void loadProductsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
    }
    
    private final void fetchCategory(java.lang.String category, kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.data.model.ApiResponse<java.util.List<com.example.shopapp.data.model.Product>>> cacheFlow) {
    }
    
    public final void clearCategoryFilter() {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.Product product) {
    }
}