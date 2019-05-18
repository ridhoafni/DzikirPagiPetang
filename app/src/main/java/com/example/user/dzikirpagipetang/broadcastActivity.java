package com.example.user.dzikirpagipetang;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class broadcastActivity extends AppCompatActivity {
    public static final int NOTIFICATION_ID = 1;
    private NotificationManager mNotificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);

        NotificationCompat.Builder mBuilder =  new NotificationCompat.Builder(getApplicationContext());
        Intent ii = new Intent(getApplicationContext(), MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(broadcastActivity.this, 0, ii, 0);

        NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
        bigText.bigText("");
        bigText.setBigContentTitle("");
        bigText.setSummaryText("Alarm Dzikir");

        mBuilder.setContentIntent(pendingIntent);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher);
        mBuilder.setContentTitle("Your Title");
        mBuilder.setContentText("Waktunya berdzikir");
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        mBuilder.setStyle(bigText);

        mBuilder.setChannel("1");

        mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("notify_001",
                    "Batam Mobile",
                    NotificationManager.IMPORTANCE_HIGH);
            mNotificationManager.createNotificationChannel(channel);
        }

        mNotificationManager.notify(1, mBuilder.build());
        Toast.makeText(broadcastActivity.this , "BROADCAST",Toast.LENGTH_SHORT).show();
    }
}
