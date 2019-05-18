package com.example.user.dzikirpagipetang;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class alarmActivity extends AppCompatActivity{
    private CardView card_dzikirpagi;
    private CardView cv_dzikirpetang;
    TimePicker alarmTimePicker;
    PendingIntent pendingIntent;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        card_dzikirpagi = (CardView) findViewById(R.id.cardview_dzikirpagi);
        cv_dzikirpetang = (CardView) findViewById(R.id.cardview_alarmdzikirpetang);

        //card_dzikirpetang.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //Intent u = new Intent(alarmActivity.this, AlarmdzikirpetangActivity.class);
                //startActivity(u);
            //}
        //});

        cv_dzikirpetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent petang = new Intent(alarmActivity.this, AlarmdzikirpetangActivity.class);
                startActivity(petang);
            }
        });


        card_dzikirpagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), AlarmdzikirpagiActivity.class);
                startActivity(i);
            }
        });



//        card_dzikirpagi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calendar calNow = Calendar.getInstance();
//                Calendar calSet = (Calendar) calNow.clone();
//
//                calSet.set(Calendar.HOUR_OF_DAY, 20);
//                calSet.set(Calendar.MINUTE, 04);
//                calSet.set(Calendar.SECOND, 0);
//                calSet.set(Calendar.MILLISECOND, 0);
//
//                if (calSet.compareTo(calNow) <= 0) {
//                    // Today Set time passed, count to tomorrow
//                    calSet.add(Calendar.DATE, 1);
//                    Log.i("hasil", " =<0");
//                } else if (calSet.compareTo(calNow) > 0) {
//                    Log.i("hasil", " > 0");
//                } else {
//                    Log.i("hasil", " else ");
//                }
//
//                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//                Intent intent = new Intent(alarmActivity.this,AlarmReceiver.class);
//                PendingIntent pendingIntent = PendingIntent.getBroadcast(alarmActivity.this,0,intent,0);
//                alarmManager.set(AlarmManager.RTC_WAKEUP, calSet.getTimeInMillis() , pendingIntent);
//                alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 1000, pendingIntent);
//                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + 500, 24 * 60 * 60 * 1000,pendingIntent); // alarm will repeat after every 15 minutes
//                Toast.makeText(alarmActivity.this, "Alarm Dzikir Pagi diaktifkan",Toast.LENGTH_SHORT).show();
//
//            }
//        });

//        card_dzikirpetang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calendar calNow = Calendar.getInstance();
//                Calendar calSet = (Calendar) calNow.clone();
//
//                calSet.set(Calendar.HOUR_OF_DAY, 17);
//                calSet.set(Calendar.MINUTE, 59);
//                calSet.set(Calendar.SECOND, 00);
//                calSet.set(Calendar.MILLISECOND, 0);
//
//                if (calSet.compareTo(calNow) <= 0) {
//                    // Today Set time passed, count to tomorrow
//                    calSet.add(Calendar.DATE, 1);
//                    Log.i("hasil", " =<0");
//                } else if (calSet.compareTo(calNow) > 0) {
//                    Log.i("hasil", " > 0");
//                } else {
//                    Log.i("hasil", " else ");
//                }
//
//                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//                Intent intent = new Intent(alarmActivity.this,AlarmReceiver.class);
//                PendingIntent pendingIntent = PendingIntent.getBroadcast(alarmActivity.this,0,intent,0);
//                //alarmManager.set(AlarmManager.RTC_WAKEUP, calSet.getTimeInMillis() , pendingIntent);
//                //alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 1000, pendingIntent);
//                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + 500, 24 * 60 * 60 * 1000,pendingIntent); // alarm will repeat after every 15 minutes
//                Toast.makeText(alarmActivity.this, "Alarm Dzikir Petang diaktifkan",Toast.LENGTH_SHORT).show();
//            }
//        });

    }

}
