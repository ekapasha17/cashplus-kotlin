package com.example.shopapp.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.shopapp.data.db.Converters.class})
@androidx.room.Database(entities = {com.example.shopapp.data.model.Product.class, com.example.shopapp.data.model.CartItem.class, com.example.shopapp.data.model.Order.class, com.example.shopapp.data.model.OrderItem.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/example/shopapp/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartDao", "Lcom/example/shopapp/data/db/CartDao;", "orderDao", "Lcom/example/shopapp/data/db/OrderDao;", "productDao", "Lcom/example/shopapp/data/db/ProductDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.shopapp.data.db.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.shopapp.data.db.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.shopapp.data.db.ProductDao productDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.shopapp.data.db.CartDao cartDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.shopapp.data.db.OrderDao orderDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/shopapp/data/db/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/shopapp/data/db/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.shopapp.data.db.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}