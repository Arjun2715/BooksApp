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

public class tab2fragment extends Fragment {
    private Button img1;
    private Button img2;
    public static tab2fragment getInstance(){
        tab2fragment tab2fragment = new tab2fragment();
        return tab2fragment;


    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2,container,false  );
        img1 = (Button) view.findViewById(R.id.lawpowerbtn);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.audible.es/pd/48-Laws-of-Power-Audiolibro/1622318641?qid=1673944889&sr=1-1&ref=a_search_c3_lProduct_1_1&pf_rd_p=edc39886-a4e3-4991-8ce5-effa92157a44&pf_rd_r=7MD8WX81Q9RTHKFSS44S&pageLoadId=FHJgcbtxKrUB4nzj&creativeId=41e85e98-10b8-40e2-907d-6b663f04a42d");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        img2 = (Button) view.findViewById(R.id.GVGLaudiobtn);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.audible.es/pd/Good-Vibes-Good-Life-Audiolibro/1788174992?qid=1673945028&sr=1-1&ref=a_search_c3_lProduct_1_1&pf_rd_p=edc39886-a4e3-4991-8ce5-effa92157a44&pf_rd_r=GMN45J9TGFPMKB4QS089&pageLoadId=KKgwtOlZ0mgTOhQd&creativeId=41e85e98-10b8-40e2-907d-6b663f04a42d");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return view;
    }
}
