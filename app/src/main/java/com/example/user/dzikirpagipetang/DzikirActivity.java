package com.example.user.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class DzikirActivity extends AppCompatActivity {
    private TextView tv_dzikirpagi, tv_dzikirpetang;
    private CardView cardview_dzikirpagi, cardview_dzikirpetang;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir);

        tv_dzikirpagi = (TextView) findViewById(R.id.tv_dzikirpagi);
        tv_dzikirpetang = (TextView) findViewById(R.id.tv_dzikirpetang);

        cardview_dzikirpagi = (CardView) findViewById(R.id.cardview_dzikirpagi);
        cardview_dzikirpetang = (CardView) findViewById(R.id.cardview_dzikirpetang);

        cardview_dzikirpagi .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(), dzikirpagiActivity.class);
                startActivity(i);
            }
        });
        cardview_dzikirpetang .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(getApplicationContext(), dzikirpetangActivity .class);
                startActivity(i);
            }
        });

    }
}
