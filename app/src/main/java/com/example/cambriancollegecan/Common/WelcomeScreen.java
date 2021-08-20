package com.example.cambriancollegecan.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.cambriancollegecan.R;

public class WelcomeScreen extends AppCompatActivity {

    /* Defining the timing to automatic redirect */
public static int screenTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeScreen.this,UserScreen.class);
                startActivity(intent);
                finish();
            }
        }, screenTime);

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcome_screen);
    }
}

