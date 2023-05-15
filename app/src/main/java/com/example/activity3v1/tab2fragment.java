package com.example.activity3v1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class tab2fragment extends Fragment {
    public List<Cart> cartItems = new ArrayList<>();
    private Button img1;
    private Button img2;
    public static tab2fragment getInstance(){
        tab2fragment tab2fragment = new tab2fragment();
        return tab2fragment;


    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2,container,false  );
        img1 = (Button) view.findViewById(R.id.lawpowerbtn);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add item to cart
                Cart cartItem = new Cart("48 Laws of Power", 14.30);
                cartItems.add(cartItem);

                // Display a toast message or perform any other action to indicate that the item was added to the cart
                Toast.makeText(getActivity(), "Item added to cart: " + cartItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        img2 = (Button) view.findViewById(R.id.GVGLaudiobtn);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart cartItem = new Cart("Good Vibes Good Life", 14.30);
                cartItems.add(cartItem);

                // Display a toast message or perform any other action to indicate that the item was added to the cart
                Toast.makeText(getActivity(), "Item added to cart: " + cartItem.getTitle(), Toast.LENGTH_SHORT).show();            }
        });
        Button viewCartButton = view.findViewById(R.id.viewCartButton);
        viewCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewCart();
            }
        });
        return view;
    }
    private void viewCart() {
        // Create an intent to open the cart view screen
        Intent intent = new Intent(getActivity(), OrderDetails.class);
        ArrayList<Cart> cartItemList = (ArrayList<Cart>) cartItems;
        intent.putParcelableArrayListExtra("cartItems", new ArrayList<>(cartItems));

        startActivity(intent);
        // Pass the cart items to the cart view screen

    }
}
