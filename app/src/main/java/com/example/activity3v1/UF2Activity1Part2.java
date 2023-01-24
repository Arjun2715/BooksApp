package com.example.activity3v1;

import static com.example.activity3v1.R.id.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class UF2Activity1Part2 extends AppCompatActivity {

    private ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(image_view);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.a));
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

    public class OnSwipeTouchListener implements View.OnTouchListener {

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