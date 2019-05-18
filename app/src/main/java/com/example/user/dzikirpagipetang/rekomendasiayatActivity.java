package com.example.user.dzikirpagipetang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class rekomendasiayatActivity extends AppCompatActivity {
    private LinearLayout al_ikhlas, al_falaq, an_naas;
    private Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasiayat);

        al_ikhlas = (LinearLayout)  findViewById(R.id.al_ikhlas);
        al_falaq = (LinearLayout)  findViewById(R.id.al_falaq);
        an_naas = (LinearLayout)  findViewById(R.id.an_naas);

        al_ikhlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), AlikhlasActivity.class);
                startActivity(i);
                //Toast.makeText(rekomendasiayatActivity.this, "Surat Al-Ikhlas",Toast.LENGTH_SHORT).show();
            }
        });
        al_falaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), AlfalaqActivity.class);
                startActivity(i);
                //Toast.makeText(rekomendasiayatActivity.this, "Surat Al-Ikhlas",Toast.LENGTH_SHORT).show();
            }
        });
        an_naas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), AnnaasActivity.class);
                startActivity(i);
                //Toast.makeText(rekomendasiayatActivity.this, "Surat Al-Ikhlas",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
