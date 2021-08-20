package com.example.cambriancollegecan.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cambriancollegecan.R;

public class SignUp extends AppCompatActivity {

    EditText fullName;
    EditText email_id;
    EditText password;
    EditText confirmPassword;
    Button createAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);


        createAccount = findViewById(R.id.create_account);
        fullName = findViewById(R.id.user_name);
        email_id = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirm_password);
    }


    public void CreateAccount(View view) {
        if (!ValidateFullName() | !ValidateEmailAddress() | !ValidatePassword()){
            return;
        }
        Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
    }



    /* Validation of registration form */

    private boolean ValidateFullName() {
        String val = fullName.getText().toString().trim();

        if (val.isEmpty()) {
            fullName.setError("Name cannot be blank");
            return false;
        } else {
            fullName.setError(null);
            return true;
        }

    }

    private boolean ValidateEmailAddress() {
        String val = email_id.getText().toString().trim();
        String checkEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (val.isEmpty()) {
            email_id.setError("Email address cannot be blank");
            return false;
        } else if (val.matches(checkEmail)) {
            email_id.setError("Invalid email address");
            return false;
        } else {
            email_id.setError(null);
            return true;
        }

    }

    private boolean ValidatePassword() {
        String val = password.getText().toString().trim();
        String checkPassword = "^" +
                                ".{8,}";
        if (val.isEmpty()) {
            password.setError("Password cannot be blank");
            return false;
        }else if(val.matches(checkPassword)){
            password.setError("Password at least contain 8 Characters");
            return false;
        }
        else {
            password.setError(null);
            return true;
        }

    }

   /* private boolean ValidateConfirmPassword() {
        String val = confirmPassword.getText().toString().trim();
        String checkConfirmPassword = matches.password;
        if (val.isEmpty()) {
            confirmPassword.setError("You have to confirm the password");
            return false;
        }else if(val.matches(checkPassword)){
            password.setError("Password at least contain 8 Characters");
            return false;
        }
        else {
            password.setError(null);
            return true;
        }

    }*/
}