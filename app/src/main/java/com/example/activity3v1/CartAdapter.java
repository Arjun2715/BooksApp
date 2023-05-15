package com.example.activity3v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CartAdapter extends ArrayAdapter<Cart> {
    private LayoutInflater inflater;

    public CartAdapter(Context context, List<Cart> cartItems) {
        super(context, 0, cartItems);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = inflater.inflate(R.layout.cart_item_layout, parent, false);
        }

        // Get the current Cart item
        Cart currentCart = getItem(position);

        // Set the title
        TextView titleTextView = itemView.findViewById(R.id.titleTextView);
        titleTextView.setText(currentCart.getTitle());

        // Set the price
        TextView priceTextView = itemView.findViewById(R.id.priceTextView);
        priceTextView.setText(String.valueOf(currentCart.getPrice()));

        // TODO: Set other views such as ImageView, buttons, etc.

        return itemView;
    }
}
