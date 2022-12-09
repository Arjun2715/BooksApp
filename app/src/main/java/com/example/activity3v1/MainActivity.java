package com.example.activity3v1;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button cart;
    Button info;
    Button menu;



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(MainActivity.this, Activity3Library.class));
        finish();

    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        cart = findViewById(R.id.cart);
        info = findViewById(R.id.info);
        menu = findViewById(R.id.menu);

        getTabs();
        openCart();
        openInfo();
        openMenu();
    }
    public void openMenu(){
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaplayToast("Menu opened");
            }
        });
    }
    private void openTopCart() {
        Intent intent = new Intent(this, OrderDetails.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }


    public void openInfo(){
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaplayToast("No Info Available");
            }
        });
    }
    public void openCart(){
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                diaplayToast("Cart Opened");
                openTopCart();
            }
        });
    }

    public void getTabs(){
       final ViewPagerAdapter ViewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                ViewPagerAdapter.addFragment(tab1fragment.getInstance(),"Library");
                ViewPagerAdapter.addFragment(tab2fragment.getInstance(),"Audio Books");
                ViewPagerAdapter.addFragment(tab3fragment.getInstance(),"Shop");
                viewPager.setAdapter(ViewPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);
            }
        });

    }





    public void diaplayToast(String Message){
        Toast.makeText(getApplicationContext(), Message,
                Toast.LENGTH_SHORT).show();
    }

    /*public void lawPowerOrder(View view) {
        diaplayToast(getString(R.string.lawPower_order_Message));
    }
    public void GoodstratergyOrder(View view) {
        diaplayToast(getString(R.string.Goodstratergy_order_Message));
    }
    public void DuneOrder(View view) {
        diaplayToast(getString(R.string.Dune_order_Message));
    }
    public void MartianOrder(View view) {
        diaplayToast(getString(R.string.Martian_order_Message));
    }
*/
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info:
                displayToast(getString(R.string.action_order_message));
                return true;
            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }

}