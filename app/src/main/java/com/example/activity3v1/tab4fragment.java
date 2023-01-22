package com.example.activity3v1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class tab4fragment extends Fragment {
    private Button lawBookOne;
    private Button goodStrategy;
    private Button thinkingStrategically;
    private Button dune;
    private Button stolen;
    private Button lawBookShareBtn;
    private Button goodStrategyShareBtn;
    private Button thinkingStrategicallyShareBtn;
    private Button duneShareBtn;
    private Button stolenShareBtn;
    ImageView imageView;
    int currentImage = 0;
    int SWIPE_MIN_DISTANCE = 0;
    int SWIPE_THRESHOLD_VELOCITY = 2;

    public static tab4fragment getInstance() {
        tab4fragment tab4fragment = new tab4fragment();
        return tab4fragment;


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4, container, false);
/*

        int[] images = {R.drawable.atomicHabit, R.drawable.ichigoichi, R.drawable.ikigai};

        imageView = (ImageView) view.findViewById(R.id.flingTest);
        imageView.setImageResource(images[currentImage]);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float x1 = event.getX();
                    float x2 = event.getX();
                    if (x1 - x2 > SWIPE_MIN_DISTANCE && Math.abs(x1 - x2) > SWIPE_THRESHOLD_VELOCITY) {
                        if (currentImage < images.length - 1) {
                            currentImage++;
                            imageView.setImageResource(images[currentImage]);
                        }
                    } else if (x2 - x1 > SWIPE_MIN_DISTANCE && Math.abs(x1 - x2) > SWIPE_THRESHOLD_VELOCITY) {
                        if (currentImage > 0) {
                            currentImage--;
                            imageView.setImageResource(images[currentImage]);
                        }
                    }
                }
                return true;
            }
        });*/

        return view;
    }
}

