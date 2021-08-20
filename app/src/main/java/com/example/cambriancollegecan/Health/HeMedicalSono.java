package com.example.cambriancollegecan.Health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cambriancollegecan.R;
import com.example.cambriancollegecan.User.LoginScreen;

public class HeMedicalSono extends AppCompatActivity {

    public Button applyNow;

    public void ApplyNow(){
        applyNow = (Button) findViewById(R.id.apply_now);
        applyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guest = new Intent(HeMedicalSono.this, LoginScreen.class);
                startActivity(guest);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.he_medical_sono);
        ApplyNow();
    }
}