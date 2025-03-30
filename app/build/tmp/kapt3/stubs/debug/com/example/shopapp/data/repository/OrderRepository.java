package com.example.shopapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J?\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/shopapp/data/repository/OrderRepository;", "", "orderDao", "Lcom/example/shopapp/data/db/OrderDao;", "(Lcom/example/shopapp/data/db/OrderDao;)V", "createOrder", "", "cartItems", "", "Lcom/example/shopapp/data/model/CartItem;", "customerName", "", "customerEmail", "customerAddress", "totalAmount", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrders", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/shopapp/data/model/Order;", "getOrderItems", "Lcom/example/shopapp/data/model/OrderItem;", "orderId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OrderRepository {
    private final com.example.shopapp.data.db.OrderDao orderDao = null;
    
    public OrderRepository(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.db.OrderDao orderDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object createOrder(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.shopapp.data.model.CartItem> cartItems, @org.jetbrains.annotations.NotNull
    java.lang.String customerName, @org.jetbrains.annotations.NotNull
    java.lang.String customerEmail, @org.jetbrains.annotations.NotNull
    java.lang.String customerAddress, double totalAmount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.Order>> getAllOrders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOrderItems(int orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.shopapp.data.model.OrderItem>> continuation) {
        return null;
    }
}