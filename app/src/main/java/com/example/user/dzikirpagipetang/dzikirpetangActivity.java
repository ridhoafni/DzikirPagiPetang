package com.example.user.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class dzikirpetangActivity extends AppCompatActivity {
    private TextView tv_ayatkursi, tv_rekomendasiayat, tv_bacaandzikir;
    private CardView cardview_ayatkursi, cardview_rekomendasiyat, cardview_bacaandzikir;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikirpetang);

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
       // ToolBarAtas2.setLogo(R.mipmap.ic_launcher); //LOGO
        ToolBarAtas2.setLogoDescription(getResources().getString(R.string.app_name));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_ayatkursi = (TextView) findViewById(R.id.tv_ayatkursi);
        tv_rekomendasiayat = (TextView) findViewById(R.id.tv_rekomendasiayat);
        tv_bacaandzikir = (TextView) findViewById(R.id.tv_bacaandzikir);

        cardview_ayatkursi = (CardView) findViewById(R.id.cardview_ayatkursi);
        cardview_rekomendasiyat = (CardView) findViewById(R.id.cardview_rekomendasiayat);
        cardview_bacaandzikir = (CardView) findViewById(R.id.cardview_bacaandzikir);

        cardview_ayatkursi .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(), ayatkursiActivity.class);
                startActivity(i);
            }
        });
        cardview_rekomendasiyat .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(), rekomendasiayatActivity .class);
                startActivity(i);
            }
        });
        cardview_bacaandzikir .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(), bacaandzikirsiangActivity.class);
                startActivity(i);
            }
        });
    }
}
