package com.example.activity3v1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class tab1fragment extends Fragment {
    private ImageView img1;
    public static tab1fragment getInstance(){
        tab1fragment tab1fragment = new tab1fragment();
        return tab1fragment;


    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1,container,false  );
        img1 = (ImageView) view.findViewById(R.id.img1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://ia802802.us.archive.org/29/items/THE48LAWSOFPOWER_201810/THE%2048%20LAWS%20OF%20POWER.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        return view;


    }
}
