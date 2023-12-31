package com.rooms.rrooms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.rooms.rrooms.R;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash.this, save_timeeee.class);
                startActivity(i);
            }
        }, 3000);
        SharedPreferences preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        String FirstTime = preferences.getString("FirstTimeInstall", "true");
        if (FirstTime.equals("Yes")) {
            Intent intent = new Intent(splash.this,save_timeeee.class);
            startActivity(intent);
        } else {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("First Time Install", "Yes");
            editor.apply();

        }
    }



}