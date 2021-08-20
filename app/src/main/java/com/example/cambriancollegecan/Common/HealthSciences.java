package com.example.cambriancollegecan.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cambriancollegecan.Health.HeAdvance;
import com.example.cambriancollegecan.Health.HeDentalAssisting;
import com.example.cambriancollegecan.Health.HeDentalHygiene;
import com.example.cambriancollegecan.Health.HeFitness;
import com.example.cambriancollegecan.Health.HeHealthAnalytics;
import com.example.cambriancollegecan.Health.HeMagnetic;
import com.example.cambriancollegecan.Health.HeMedicalSono;
import com.example.cambriancollegecan.Health.HeScienceNursing;
import com.example.cambriancollegecan.R;

public class HealthSciences extends AppCompatActivity {

    public TextView advanceCare;
    public TextView scienceNursing;
    public TextView dentalAssisting;
    public TextView dentalHygiene;
    public TextView medicalSonorgraphy;
    public TextView healthAnalytics;
    public TextView magnetic;
    public TextView fitness;

    public void AdvanceCare(){
        advanceCare = (TextView) findViewById(R.id.he_1);
        advanceCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeAdvance.class);
                startActivity(contact);
            }
        });
    }

    public void ScienceNursing(){
        scienceNursing = (TextView) findViewById(R.id.he_2);
        scienceNursing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeScienceNursing.class);
                startActivity(contact);
            }
        });
    }

    public void DentalAssisting(){
        dentalAssisting = (TextView) findViewById(R.id.he_3);
        dentalAssisting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeDentalAssisting.class);
                startActivity(contact);
            }
        });
    }

    public void DentalHygiene(){
        dentalHygiene = (TextView) findViewById(R.id.he_4);
        dentalHygiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeDentalHygiene.class);
                startActivity(contact);
            }
        });
    }

    public void MedicalSono(){
        medicalSonorgraphy = (TextView) findViewById(R.id.he_5);
        medicalSonorgraphy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeMedicalSono.class);
                startActivity(contact);
            }
        });
    }

    public void HealthAnalytics(){
        healthAnalytics = (TextView) findViewById(R.id.he_7);
        healthAnalytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeHealthAnalytics.class);
                startActivity(contact);
            }
        });
    }

    public void Magnetic(){
        magnetic = (TextView) findViewById(R.id.he_8);
        magnetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeMagnetic.class);
                startActivity(contact);
            }
        });
    }

    public void Fitness(){
        fitness = (TextView) findViewById(R.id.he_6);
        fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(HealthSciences.this, HeFitness.class);
                startActivity(contact);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_sciences);
        AdvanceCare();
        ScienceNursing();
        DentalAssisting();
        DentalHygiene();
        MedicalSono();
        HealthAnalytics();
        Magnetic();
        Fitness();
    }
}