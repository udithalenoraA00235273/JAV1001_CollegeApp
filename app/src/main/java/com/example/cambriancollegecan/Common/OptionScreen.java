package com.example.cambriancollegecan.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.cambriancollegecan.R;

public class OptionScreen extends AppCompatActivity {

    public ImageButton contactUs;
    public ImageButton aboutUs;
    public ImageButton programs;
    public ImageButton studentLife;

    public void ContactUs(){
        contactUs = (ImageButton)findViewById(R.id.contact_us);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(OptionScreen.this,ContactUs.class);
                startActivity(contact);
            }
        });
    }

    public void AboutUs(){
        aboutUs = (ImageButton)findViewById(R.id.about_us);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(OptionScreen.this,AboutUs.class);
                startActivity(about);
            }
        });
    }

    public void Programs(){
        programs = (ImageButton)findViewById(R.id.programs);
        programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent programs = new Intent(OptionScreen.this,Programs.class);
                startActivity(programs);
            }
        });
    }

    public void StudentLife(){
        studentLife = (ImageButton)findViewById(R.id.student_life);
        studentLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent student = new Intent(OptionScreen.this,StudentLife.class);
                startActivity(student);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_screen);
        ContactUs();
        AboutUs();
        Programs();
        StudentLife();

    }
}