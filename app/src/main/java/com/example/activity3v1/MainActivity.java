package com.example.activity3v1;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        getTabs();

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
}