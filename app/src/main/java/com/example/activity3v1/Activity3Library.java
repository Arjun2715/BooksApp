package com.example.activity3v1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3Library extends AppCompatActivity {
    private Button reading;
    private Button library;
    private Button audio_Books;
    private Button shop;
    private ImageView laws48;
    private ImageView goodStrat;
    private ImageView thinking;
    private ImageView dune;
    private ImageView martian;
    private ImageView aSpaceOdessey;
    private ImageView manifest;
    private ImageView confortBook;
    private ImageView goodVibes;
    private ImageView theLastThing;
    private ImageView theThursdayMurder;
    private ImageView killingFloor;
    private ImageView deamon;
    private ImageView intoNeon;
    private ImageView akira;

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to log out?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Activity3Library.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Button listeners
        /*library = findViewById(R.id.Libarary);
        audio_Books = findViewById(R.id.Audio_Books);
        shop = findViewById(R.id.Book_Store);*/
//set on click listeners for the buttons
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLibrary();
            }
        });
        /*reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });*/
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShop();
            }
        });
        audio_Books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAudioBooks();
            }
        });
//clicable images find by id's
        /*laws48 = findViewById(R.id.img1);
        goodStrat = findViewById(R.id.img2);
        thinking = findViewById(R.id.img3);
        dune = findViewById(R.id.img4);
        martian = findViewById(R.id.img5);
        aSpaceOdessey = findViewById(R.id.img6);
        manifest = findViewById(R.id.img7);
        confortBook = findViewById(R.id.img8);
        goodVibes = findViewById(R.id.img9);
        theLastThing = findViewById(R.id.img10);
        theThursdayMurder = findViewById(R.id.img11);
        killingFloor = findViewById(R.id.img12);
        deamon = findViewById(R.id.img13);
        intoNeon = findViewById(R.id.img14);
        akira = findViewById(R.id.img15);*/
        //set on click listeners for the images
        /*laws48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        goodStrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        thinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        dune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        martian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        aSpaceOdessey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        manifest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        confortBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        goodVibes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        theLastThing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        theThursdayMurder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        killingFloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        deamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        intoNeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        akira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });*/
    }

    //methods for Intents
    private void openLibrary() {
        Intent intent = new Intent(this, Activity3Library.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

//    private void openReading() {
//        Intent intent = new Intent(this, Activity2Reading.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//        startActivity(intent);
//    }

    private void openShop() {
        Intent intent = new Intent(this, Activity5Shop.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    private void openAudioBooks() {
        Intent intent = new Intent(this, Activity4AudioBooks.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}