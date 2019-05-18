package com.example.user.dzikirpagipetang;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by user on 9/18/2018.
 */

public class AlarmReceiver extends BroadcastReceiver {
    public static final int NOTIFICATION_ID = 1;
    private NotificationManager mNotificationManager;
    MediaPlayer player;
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Dzikir Aktif",Toast.LENGTH_SHORT).show();

        player=MediaPlayer.create(context,R.raw.alarm);
        player.start();

//        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
////        if (alarmUri == null)
////        {
////            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
////        }
//        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
//        ringtone.play();

        //Intent i= new Intent(context, Ala.class);
        //i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //i.putExtra("message","Cek");
        //context.startActivity(i);

        NotificationCompat.Builder mBuilder =  new NotificationCompat.Builder(context.getApplicationContext());
        Intent ii = new Intent(context.getApplicationContext(), MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, ii, 0);

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

        mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("notify_001",
                    "Batam Mobile",
                    NotificationManager.IMPORTANCE_DEFAULT);
            mNotificationManager.createNotificationChannel(channel);
        }

        mNotificationManager.notify(0, mBuilder.build());
    }
}
