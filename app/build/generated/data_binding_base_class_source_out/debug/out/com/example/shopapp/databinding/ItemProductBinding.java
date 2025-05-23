// Generated by view binder compiler. Do not edit!
package com.example.shopapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shopapp.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemProductBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final Button buttonAddToCart;

  @NonNull
  public final ImageView imageProduct;

  @NonNull
  public final TextView textProductName;

  @NonNull
  public final TextView textProductPrice;

  private ItemProductBinding(@NonNull MaterialCardView rootView, @NonNull Button buttonAddToCart,
      @NonNull ImageView imageProduct, @NonNull TextView textProductName,
      @NonNull TextView textProductPrice) {
    this.rootView = rootView;
    this.buttonAddToCart = buttonAddToCart;
    this.imageProduct = imageProduct;
    this.textProductName = textProductName;
    this.textProductPrice = textProductPrice;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_add_to_cart;
      Button buttonAddToCart = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddToCart == null) {
        break missingId;
      }

      id = R.id.image_product;
      ImageView imageProduct = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct == null) {
        break missingId;
      }

      id = R.id.text_product_name;
      TextView textProductName = ViewBindings.findChildViewById(rootView, id);
      if (textProductName == null) {
        break missingId;
      }

      id = R.id.text_product_price;
      TextView textProductPrice = ViewBindings.findChildViewById(rootView, id);
      if (textProductPrice == null) {
        break missingId;
      }

      return new ItemProductBinding((MaterialCardView) rootView, buttonAddToCart, imageProduct,
          textProductName, textProductPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
