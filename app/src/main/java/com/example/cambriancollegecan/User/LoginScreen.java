package com.example.cambriancollegecan.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.cambriancollegecan.Common.OptionScreen;
import com.example.cambriancollegecan.Common.UserScreen;
import com.example.cambriancollegecan.R;

public class LoginScreen extends AppCompatActivity {

    /* Defining variable for the button */
    public Button userCreation;

    /* Defining method to direct to sign up page */
    public void UserCreation(){
        userCreation = (Button) findViewById(R.id.sign_up);
        userCreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guest = new Intent(LoginScreen.this, SignUp.class);
                startActivity(guest);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        UserCreation();
    }
}