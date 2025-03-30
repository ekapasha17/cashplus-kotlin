package com.example.shopapp.data.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.shopapp.data.model.Order;
import com.example.shopapp.data.model.OrderItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OrderDao_Impl implements OrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Order> __insertionAdapterOfOrder;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<OrderItem> __insertionAdapterOfOrderItem;

  public OrderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrder = new EntityInsertionAdapter<Order>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `orders` (`id`,`customerName`,`customerEmail`,`customerAddress`,`totalAmount`,`orderDate`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Order value) {
        stmt.bindLong(1, value.getId());
        if (value.getCustomerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCustomerName());
        }
        if (value.getCustomerEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCustomerEmail());
        }
        if (value.getCustomerAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCustomerAddress());
        }
        stmt.bindDouble(5, value.getTotalAmount());
        final Long _tmp = __converters.dateToTimestamp(value.getOrderDate());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
      }
    };
    this.__insertionAdapterOfOrderItem = new EntityInsertionAdapter<OrderItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `order_items` (`orderId`,`productId`,`productName`,`quantity`,`price`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderItem value) {
        stmt.bindLong(1, value.getOrderId());
        stmt.bindLong(2, value.getProductId());
        if (value.getProductName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductName());
        }
        stmt.bindLong(4, value.getQuantity());
        stmt.bindDouble(5, value.getPrice());
      }
    };
  }

  @Override
  public Object insertOrder(final Order order, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfOrder.insertAndReturnId(order);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertOrderItems(final List<OrderItem> orderItems,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOrderItem.insert(orderItems);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Order>> getAllOrders() {
    final String _sql = "SELECT * FROM orders ORDER BY orderDate DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"orders"}, new Callable<List<Order>>() {
      @Override
      public List<Order> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerName");
          final int _cursorIndexOfCustomerEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "customerEmail");
          final int _cursorIndexOfCustomerAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "customerAddress");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "totalAmount");
          final int _cursorIndexOfOrderDate = CursorUtil.getColumnIndexOrThrow(_cursor, "orderDate");
          final List<Order> _result = new ArrayList<Order>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Order _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerEmail;
            if (_cursor.isNull(_cursorIndexOfCustomerEmail)) {
              _tmpCustomerEmail = null;
            } else {
              _tmpCustomerEmail = _cursor.getString(_cursorIndexOfCustomerEmail);
            }
            final String _tmpCustomerAddress;
            if (_cursor.isNull(_cursorIndexOfCustomerAddress)) {
              _tmpCustomerAddress = null;
            } else {
              _tmpCustomerAddress = _cursor.getString(_cursorIndexOfCustomerAddress);
            }
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final Date _tmpOrderDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfOrderDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfOrderDate);
            }
            _tmpOrderDate = __converters.fromTimestamp(_tmp);
            _item = new Order(_tmpId,_tmpCustomerName,_tmpCustomerEmail,_tmpCustomerAddress,_tmpTotalAmount,_tmpOrderDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getOrderItemsForOrder(final int orderId,
      final Continuation<? super List<OrderItem>> continuation) {
    final String _sql = "SELECT * FROM order_items WHERE orderId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, orderId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<OrderItem>>() {
      @Override
      public List<OrderItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "orderId");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final List<OrderItem> _result = new ArrayList<OrderItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OrderItem _item;
            final int _tmpOrderId;
            _tmpOrderId = _cursor.getInt(_cursorIndexOfOrderId);
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            _item = new OrderItem(_tmpOrderId,_tmpProductId,_tmpProductName,_tmpQuantity,_tmpPrice);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
