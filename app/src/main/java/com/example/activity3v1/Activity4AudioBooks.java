package com.example.activity3v1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4AudioBooks extends AppCompatActivity {
    //componentes de este Actividad
    private Button reading;
    private Button library;
    private Button audio_Books;
    private Button shop;
    private Button lawsPower;
    private Button GVGL;
    private Button dune;
    private Button killingFloor;
    private Button badMagic;
    private Button deamon;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Activity4AudioBooks.this, Activity3Library.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2);
        // bottom menu buttons
        /*library = findViewById(R.id.Libarary);
        reading = findViewById(R.id.Reading_Now);
        audio_Books = findViewById(R.id.Audio_Books);
        shop = findViewById(R.id.Book_Store);*/
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
        //books buy button
        lawsPower = findViewById(R.id.lawpowerbtn);
        GVGL = findViewById(R.id.GVGLaudiobtn);
        dune = findViewById(R.id.duneAudiobtn);
        killingFloor = findViewById(R.id.kilingFloorAudiobtn);
        badMagic = findViewById(R.id.badMagicAudiobtn);
        deamon = findViewById(R.id.daemonAudiobtn);
        //setonclicklisteners
        lawsPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLawpowerAudioBookLink();
            }
        });
        GVGL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGVGLAudioBookLink();
            }
        });
        dune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuneAudioBookLink();
            }
        });
        killingFloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKillingFloorAudioBookLink();
            }
        });
        badMagic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBadMagicAudioBookLink();
            }
        });
        deamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaemonAudioBookLink();
            }
        });


    }


    //todos los intents de este Actividad dentro de differente metodos para evitar errors en la app
    private void openLawpowerAudioBookLink() {
        Uri uri = Uri.parse("https://www.amazon.com/48-Laws-of-Power-Robert-Greene-audiobook/dp/B00X0TKUS0");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openGVGLAudioBookLink() {
        Uri uri = Uri.parse("https://www.amazon.com/-/es/dp/B08NWBJQXY/ref=sr_1_1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openDuneAudioBookLink() {
        Uri uri = Uri.parse("https://www.amazon.com/-/es/dp/B000R34YKC/ref=sr_1_1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openKillingFloorAudioBookLink() {
        Uri uri = Uri.parse("https://www.amazon.com/-/es/dp/B015RPX6IU/ref=sr_1_1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openBadMagicAudioBookLink() {
        Uri uri = Uri.parse("https://www.amazon.com/-/es/dp/B00MMIOKOA/ref=sr_1_1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openDaemonAudioBookLink() {
        Uri uri = Uri.parse("https://www.amazon.com/-/es/dp/B001QCZTWA/ref=sr_1_1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openLibrary() {
        Intent intent = new Intent(this, Activity3Library.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    /*private void openReading() {
        Intent intent = new Intent(this, Activity2Reading.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }*/

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