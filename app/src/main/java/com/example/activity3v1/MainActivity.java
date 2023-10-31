package com.example.activity3v1;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button cart;
    Button info;
    Button menu;
    Button menuButton;
    DrawerLayout drawer;


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
        menu = findViewById(R.id.menu);

        getTabs();
        openMenu();

        //joan
        menuButton = findViewById(R.id.menu);
        drawer = findViewById(R.id.drawer_layout);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view);
        //listeners

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_item_1:
                        // Handle the Cart item click
                        Intent orderDetailsIntent = new Intent(MainActivity.this, OrderDetails.class);
                        startActivity(orderDetailsIntent);
                        return true;
                    case R.id.nav_item_2:
                        // Handle the Info item click
                        Intent orderDetailsIntent2 = new Intent(MainActivity.this, ActivityInfo.class);
                        startActivity(orderDetailsIntent2);

                        return true;
                    default:
                        return false;
                }
            }
        });

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
    private void openTopInfo() {
        Intent intent = new Intent(this, ActivityInfo.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }


    public void openInfo(){
        info.setOnClickListener(view -> {
            diaplayToast("Info");
            openTopInfo();
        });
    }
    public void openCart(){
        cart.setOnClickListener(view -> {

            diaplayToast("Cart Opened");
            openTopCart();
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

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }*/

}