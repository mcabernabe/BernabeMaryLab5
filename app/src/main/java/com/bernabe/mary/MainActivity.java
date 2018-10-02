package com.bernabe.mary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button2) {
            i = new Intent(this, Activity_2.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.589813,120.975311"));
            chooser = Intent.createChooser(i, "create a map app");
            startActivity(chooser);
        }
    }
}
