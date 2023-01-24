package com.example.activity3v1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
public class ActivityUF2Act1 extends Fragment {
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

    public static ActivityUF2Act1 getInstance() {
        ActivityUF2Act1 tab4fragment = new ActivityUF2Act1();
        return tab4fragment;


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.uf2act1, container, false);

        CarouselImageView carouselImageView = view.findViewById(R.id.carousel_image);
        carouselImageView.setImages(new Drawable[]{
                getResources().getDrawable(R.drawable.ikigai),
                getResources().getDrawable(R.drawable.atomichabit),
                getResources().getDrawable(R.drawable.ichigoichi)

        });
        return view;
    }

    public static class CarouselImageView extends AppCompatImageView {
        private int currentImage = 0;
        private Drawable[] images;
        private GestureDetector gestureDetector;

        public CarouselImageView(Context context, AttributeSet attrs) {
            super(context, attrs);
            gestureDetector = new GestureDetector(context, new GestureListener());
        }

        public void setImages(Drawable[] images) {
            this.images = images;
            setImageDrawable(images[0]);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            gestureDetector.onTouchEvent(event);
            return true;
        }

        private class GestureListener extends GestureDetector.SimpleOnGestureListener {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (velocityX < 0) {
                    // Swipe left
                    currentImage = (currentImage + 1) % images.length;
                    setImageDrawable(images[currentImage]);
                } else {
                    // Swipe right
                    currentImage = (currentImage - 1 + images.length) % images.length;
                    setImageDrawable(images[currentImage]);
                }
                return true;
            }
        }
    }
}











