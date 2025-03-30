package com.example.shopapp.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/shopapp/data/db/OrderDao;", "", "getAllOrders", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/shopapp/data/model/Order;", "getOrderItemsForOrder", "Lcom/example/shopapp/data/model/OrderItem;", "orderId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrder", "", "order", "(Lcom/example/shopapp/data/model/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrderItems", "", "orderItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface OrderDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.model.Order order, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertOrderItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.shopapp.data.model.OrderItem> orderItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM orders ORDER BY orderDate DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.shopapp.data.model.Order>> getAllOrders();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM order_items WHERE orderId = :orderId")
    public abstract java.lang.Object getOrderItemsForOrder(int orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.shopapp.data.model.OrderItem>> continuation);
}