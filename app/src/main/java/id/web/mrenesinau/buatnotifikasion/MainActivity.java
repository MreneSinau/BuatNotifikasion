package id.web.mrenesinau.buatnotifikasion;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnnotifikasi;

    // identititas id unik untuk notification
    public static final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*getSupportActionBar().setSubtitle("Belajar di okedroid.com");*/
    }

    public void tampilNotification(View view) {
        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher) //ikon notification
                .setContentTitle("Notifikasi Baru") //judul konten
                .setAutoCancel(true)//untuk menswipe atau menghapus notification
                .setContentText("Ini Adalah Notifikasi"); //isi text
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }

}
