package com.example.user.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DetailayatActivity extends AppCompatActivity {
    private ImageView al_fatihah, al_humazah;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailayat);


        String surat = getIntent().getStringExtra("surat").toString();
        Toast.makeText(DetailayatActivity.this, surat ,Toast.LENGTH_SHORT).show();

        al_fatihah = (ImageView)  findViewById(R.id.al_fatihah);
        al_humazah = (ImageView)  findViewById(R.id.al_humazah);

        if(surat.equals("al_fatihah"))
        {
            al_fatihah.setVisibility(View.VISIBLE);
        }else if(surat.equals("al_humazah"))
        {
            al_humazah.setVisibility(View.VISIBLE);
        }
    }
}
