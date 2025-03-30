package com.example.shopapp.ui.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002 !B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\""}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "cartRepository", "Lcom/example/shopapp/data/repository/CartRepository;", "orderRepository", "Lcom/example/shopapp/data/repository/OrderRepository;", "(Lcom/example/shopapp/data/repository/CartRepository;Lcom/example/shopapp/data/repository/OrderRepository;)V", "_navigationEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$NavigationEvent;", "_orderStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus;", "customerAddress", "", "getCustomerAddress", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "customerEmail", "getCustomerEmail", "customerName", "getCustomerName", "navigationEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "orderStatus", "Lkotlinx/coroutines/flow/StateFlow;", "getOrderStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "placeOrder", "", "resetCheckout", "NavigationEvent", "OrderStatus", "app_debug"})
public final class CheckoutViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.shopapp.data.repository.CartRepository cartRepository = null;
    private final com.example.shopapp.data.repository.OrderRepository orderRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> customerName = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> customerEmail = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> customerAddress = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus> _orderStatus = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus> orderStatus = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.shopapp.ui.checkout.CheckoutViewModel.NavigationEvent> _navigationEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.shopapp.ui.checkout.CheckoutViewModel.NavigationEvent> navigationEvent = null;
    
    public CheckoutViewModel(@org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.CartRepository cartRepository, @org.jetbrains.annotations.NotNull
    com.example.shopapp.data.repository.OrderRepository orderRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getCustomerEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getCustomerAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus> getOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.shopapp.ui.checkout.CheckoutViewModel.NavigationEvent> getNavigationEvent() {
        return null;
    }
    
    public final void placeOrder() {
    }
    
    public final void resetCheckout() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus;", "", "()V", "Error", "Initial", "Loading", "Success", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Error;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Initial;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Loading;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Success;", "app_debug"})
    public static abstract class OrderStatus {
        
        private OrderStatus() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Initial;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus;", "()V", "app_debug"})
        public static final class Initial extends com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus {
            @org.jetbrains.annotations.NotNull
            public static final com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus.Initial INSTANCE = null;
            
            private Initial() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Loading;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus;", "()V", "app_debug"})
        public static final class Loading extends com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus {
            @org.jetbrains.annotations.NotNull
            public static final com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Success;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus {
            private final long orderId = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus.Success copy(long orderId) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Success(long orderId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus$Error;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$OrderStatus;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.example.shopapp.ui.checkout.CheckoutViewModel.OrderStatus.Error copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$NavigationEvent;", "", "()V", "NavigateToOrderConfirmation", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$NavigationEvent$NavigateToOrderConfirmation;", "app_debug"})
    public static abstract class NavigationEvent {
        
        private NavigationEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutViewModel$NavigationEvent$NavigateToOrderConfirmation;", "Lcom/example/shopapp/ui/checkout/CheckoutViewModel$NavigationEvent;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToOrderConfirmation extends com.example.shopapp.ui.checkout.CheckoutViewModel.NavigationEvent {
            private final long orderId = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final com.example.shopapp.ui.checkout.CheckoutViewModel.NavigationEvent.NavigateToOrderConfirmation copy(long orderId) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NavigateToOrderConfirmation(long orderId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
            }
        }
    }
}