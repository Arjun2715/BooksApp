package com.example.activity3v1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
public class OrderDetails extends AppCompatActivity {
    private ListView cartListView;
    private ArrayList<Cart> cartItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        cartItems = getIntent().getParcelableArrayListExtra("cartItems");

        cartListView = findViewById(R.id.cartListView);
        CartAdapter adapter = new CartAdapter(this, cartItems);
        cartListView.setAdapter(adapter);
    }
}