package com.example.activity3v1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.widget.AppCompatImageView;
public class UF2Activity1Part2 extends AppCompatActivity {
    private ImageView
            imageView;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uf2_activity1_part2);
        imageView = findViewById(R.id.image_view);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.a1));

        imageView.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
                // Scale animation
                Animation scale = AnimationUtils.loadAnimation(UF2Activity1Part2.this, R.anim.scale);
                imageView.startAnimation(scale);
            }

            @Override
            public void onSwipeRight() {
                // Translate animation
                Animation translate = AnimationUtils.loadAnimation(UF2Activity1Part2.this, R.anim.translate);
                imageView.startAnimation(translate);
            }

            @Override
            public void onSwipeTop() {
                // Alpha animation
                Animation alpha = AnimationUtils.loadAnimation(UF2Activity1Part2.this, R.anim.alpha);
                imageView.startAnimation(alpha);
            }

            @Override
            public void onSwipeBottom() {
                // Rotate animation
                Animation rotate = AnimationUtils.loadAnimation(UF2Activity1Part2.this, R.anim.rotate);
                imageView.startAnimation(rotate);
            }
        });
    }
    public static class OnSwipeTouchListener implements View.OnTouchListener {

        private final GestureDetector gestureDetector;

        public OnSwipeTouchListener(Context context) {
            gestureDetector = new GestureDetector(context, new GestureListener());
        }

        public void onSwipeLeft() {
        }

        public void onSwipeRight() {
        }

        public void onSwipeTop() {
        }

        public void onSwipeBottom() {
        }

        @SuppressLint("ClickableViewAccessibility")
        public boolean onTouch(View v, MotionEvent event) {
            return gestureDetector.onTouchEvent(event);
        }

        private final class GestureListener extends GestureDetector.SimpleOnGestureListener {

            private static final int SWIPE_DISTANCE_THRESHOLD = 100;
            private static final int SWIPE_VELOCITY_THRESHOLD = 100;

            @Override
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                float distanceX = e2.getX() - e1.getX();
                float distanceY = e2.getY() - e1.getY();
                if (Math.abs(distanceX) > Math.abs(distanceY) && Math.abs(distanceX) > SWIPE_DISTANCE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                    if (distanceX > 0)
                        onSwipeRight();
                    else
                        onSwipeLeft();
                    return true;
                } else if (Math.abs(distanceY) > SWIPE_DISTANCE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                    if (distanceY > 0)
                        onSwipeBottom();
                    else
                        onSwipeTop();
                    return true;
                }
                return false;
            }
        }
    }
}