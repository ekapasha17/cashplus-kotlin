package com.example.shopapp.ui.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutFragmentDirections;", "", "()V", "ActionCheckoutFragmentToOrderConfirmationFragment", "Companion", "app_debug"})
public final class CheckoutFragmentDirections {
    @org.jetbrains.annotations.NotNull
    public static final com.example.shopapp.ui.checkout.CheckoutFragmentDirections.Companion Companion = null;
    
    private CheckoutFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutFragmentDirections$ActionCheckoutFragmentToOrderConfirmationFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "(J)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    static final class ActionCheckoutFragmentToOrderConfirmationFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final int actionId = com.example.shopapp.R.id.action_checkoutFragment_to_orderConfirmationFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.shopapp.ui.checkout.CheckoutFragmentDirections.ActionCheckoutFragmentToOrderConfirmationFragment copy(long orderId) {
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
        
        public ActionCheckoutFragmentToOrderConfirmationFragment(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/shopapp/ui/checkout/CheckoutFragmentDirections$Companion;", "", "()V", "actionCheckoutFragmentToOrderConfirmationFragment", "Landroidx/navigation/NavDirections;", "orderId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionCheckoutFragmentToOrderConfirmationFragment(long orderId) {
            return null;
        }
    }
}