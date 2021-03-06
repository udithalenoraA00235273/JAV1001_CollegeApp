package com.example.cambriancollegecan.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.cambriancollegecan.R;
import com.example.cambriancollegecan.User.LoginScreen;

public class UserScreen extends AppCompatActivity {

    /* Defining variables for Image Buttons */
    public ImageButton guestUser;
    public ImageButton registeredUser;

    /* Defining methods for image buttons to direct to specific page */
    public void GuestUser(){
        guestUser = (ImageButton)findViewById(R.id.guest_user);
        guestUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guest = new Intent(UserScreen.this,OptionScreen.class);
                startActivity(guest);
            }
        });
    }
    public void registeredUser(){
        registeredUser = (ImageButton)findViewById(R.id.registered_user);
        registeredUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(UserScreen.this, LoginScreen.class);
                startActivity(register);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_screen);
        GuestUser();
        registeredUser();
    }
}