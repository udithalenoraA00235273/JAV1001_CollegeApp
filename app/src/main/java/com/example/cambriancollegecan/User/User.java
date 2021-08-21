package com.example.cambriancollegecan.User;

import android.widget.EditText;

public class User {
    public String fullName, emailAddress;

    public User(EditText fullName, String email, String pw){

    }

    public User(String fullName, String emailAddress){
        this.fullName = fullName;
        this.emailAddress = emailAddress;
    }
}
