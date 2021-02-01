package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler=new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent=new Intent(SplashActivity.this,DaburLogin.class);
            startActivity(intent);
        }
    },1000);
    }
}
