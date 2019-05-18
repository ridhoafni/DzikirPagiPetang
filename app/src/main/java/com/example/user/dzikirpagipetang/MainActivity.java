package com.example.user.dzikirpagipetang;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_dzikir, tv_alarm, tv_about;
    Typeface font;
    private CardView card_dzikir, card_alarm, card_about;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        card_dzikir = (CardView) findViewById(R.id.cardview_dzikir);
        card_alarm= (CardView) findViewById(R.id.cardview_alarm);
        card_about = (CardView) findViewById(R.id.cardview_about);

        card_dzikir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), DzikirActivity.class);
                startActivity(i);
            }
        });

        card_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), alarmActivity.class);
                startActivity(i);
            }
        });

        card_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), aboutActivity.class);
                startActivity(i);
            }
        });

    }
}
