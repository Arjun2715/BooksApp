package com.example.activity3v1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class tab3fragment extends Fragment {
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


    public static tab3fragment getInstance() {
        tab3fragment tab3fragment = new tab3fragment();
        return tab3fragment;


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);

        lawBookOne = view.findViewById(R.id.lawpowerbtn);
        stolen = view.findViewById(R.id.stolenbtn);
        goodStrategy = view.findViewById(R.id.goodstratbtn);
        thinkingStrategically = view.findViewById(R.id.thinkingstratbtn);
        dune = view.findViewById(R.id.dunebtn);
        lawBookOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://ia802802.us.archive.org/29/items/THE48LAWSOFPOWER_201810/THE%2048%20LAWS%20OF%20POWER.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        goodStrategy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://dspace.vnbrims.org:13000/jspui/bitstream/123456789/4584/1/Good%20Strategy_Bad%20Strategy.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        thinkingStrategically.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.es/Thinking-Strategically-Competitive-Business-Paperback/dp/0393310353");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        dune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.es/Dune-Nueva-edición-Las-crónicas/dp/8466353771/ref=sr_1_1?__mk_es_ES=ÅMÅŽÕÑ&crid=C4AG1SIRRO69&keywords=dune&qid=1673944480&sprefix=dun%2Caps%2C101&sr=8-1");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        stolen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amazon.es/Stolen-Lucy-Christopher/dp/1908435755");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        lawBookShareBtn = (Button) view.findViewById(R.id.lawpowerSharebtn);
        goodStrategyShareBtn = (Button) view.findViewById(R.id.goodstratbtnShare);
        thinkingStrategicallyShareBtn = (Button) view.findViewById(R.id.thinkingstratSharebtn);
        duneShareBtn = (Button) view.findViewById(R.id.duneSharebtn);
        stolenShareBtn = (Button) view.findViewById(R.id.stolenSharebtn);

        lawBookShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent();
            }
        });

        goodStrategyShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent();
            }
        });

        thinkingStrategicallyShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent();
            }
        });

        duneShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent();
            }
        });

        stolenShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent();
            }
        });


        return view;
    }
    //share intents for books
    private void shareIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Share using"));
    }




}
