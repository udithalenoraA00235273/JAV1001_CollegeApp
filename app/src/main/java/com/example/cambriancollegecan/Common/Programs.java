package com.example.cambriancollegecan.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.cambriancollegecan.R;

public class Programs extends AppCompatActivity {

    /* Defining variables for Image Buttons */
    public ImageButton healthScience;
    public ImageButton skilledTrade;
    public ImageButton engineering;
    public ImageButton creativeArts;
    public ImageButton communityServices;
    public ImageButton lawJustice;
    public ImageButton businessInformation;
    public ImageButton safetyEnvironmental;

    /* Defining methods for image buttons to direct to specific page */
    public void HealthScience(){
        healthScience = (ImageButton)findViewById(R.id.health);
        healthScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,HealthSciences.class);
                startActivity(contact);
            }
        });
    }

    public void SkilledTrade(){
        skilledTrade = (ImageButton)findViewById(R.id.skilled_trades);
        skilledTrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,SkilledTrade.class);
                startActivity(contact);
            }
        });
    }

    public void Engineering(){
        engineering = (ImageButton)findViewById(R.id.engineering);
        engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,EngineeringTech.class);
                startActivity(contact);
            }
        });
    }

    public void CreativeArt(){
        creativeArts = (ImageButton)findViewById(R.id.creative_arts);
        creativeArts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,CreativeArts.class);
                startActivity(contact);
            }
        });
    }

    public void CommunityServices(){
        communityServices = (ImageButton)findViewById(R.id.community);
        communityServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,ComServices.class);
                startActivity(contact);
            }
        });
    }

    public void LawJustice(){
        lawJustice = (ImageButton)findViewById(R.id.law);
        lawJustice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,LawJustice.class);
                startActivity(contact);
            }
        });
    }

    public void BusinessInformation(){
        businessInformation = (ImageButton)findViewById(R.id.business);
        businessInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,BusinessInfo.class);
                startActivity(contact);
            }
        });
    }

    public void SafetyEnv(){
        safetyEnvironmental = (ImageButton)findViewById(R.id.safety);
        safetyEnvironmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(Programs.this,SafetyEnv.class);
                startActivity(contact);
            }
        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programs);
        HealthScience();
        SkilledTrade();
        Engineering();
        CreativeArt();
        CommunityServices();
        LawJustice();
        BusinessInformation();
        SafetyEnv();

    }
}