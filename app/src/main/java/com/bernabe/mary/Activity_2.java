package com.bernabe.mary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.button){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.button4) {
        i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:14.594668,120.970563"));
        chooser = Intent.createChooser(i, "create a map app");
        startActivity(chooser);
    }
    }
}
