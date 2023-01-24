package com.example.activity3v1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

public class UF2Activity1Part1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uf2_activity1_part1);

        ActivityUF2Act1.CarouselImageView carouselImageView = findViewById(R.id.carousel_image);
        carouselImageView.setImages(new Drawable[]{
                getResources().getDrawable(R.drawable.ikigai),
                getResources().getDrawable(R.drawable.atomichabit),
                getResources().getDrawable(R.drawable.ichigoichi)

        });
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