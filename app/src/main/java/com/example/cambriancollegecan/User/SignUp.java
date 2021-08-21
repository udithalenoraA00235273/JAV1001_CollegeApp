package com.example.cambriancollegecan.User;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cambriancollegecan.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    /* Defining variables for edit texts & button */
    EditText fullName;
    EditText email_id;
    EditText password;
    Button createAccount;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mAuth = FirebaseAuth.getInstance();

        /* Defining hooks for each variable */
        createAccount = findViewById(R.id.create_account);
        fullName = findViewById(R.id.user_name);
        email_id = findViewById(R.id.email);
        password = findViewById(R.id.password);
        createAccount = findViewById(R.id.create_account);
        createAccount.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create_account:
                createUser();
                break;

        }
    }

    /* User registration form validation */
    private void createUser() {
        String full_Name = fullName.getText().toString().trim();
        String email = email_id.getText().toString().trim();
        String pw = password.getText().toString().trim();

        if (full_Name.isEmpty()){
            fullName.setError("Name cannot be blank");
            fullName.requestFocus();
            return;
        }

        if (email.isEmpty()){
            email_id.setError("Email cannot be blank");
            email_id.requestFocus();
            return;
        }
       /* if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            email_id.setError("Enter a valid email address");
            email_id.requestFocus();
            return;
        } */
        if (pw.isEmpty()){
            password.setError("Password cannot be blank");
            password.requestFocus();
            return;
        }
        if (pw.length() < 8){
            password.setError("Minimum length should be 6 Characters");
            password.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, pw)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            User user = new User (fullName, email, pw);

                            FirebaseDatabase.getInstance().getReference("Users")
                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()){
                                            Toast.makeText(SignUp.this, "User has been registered successfully!",Toast.LENGTH_LONG).show();
                                        }else{
                                            Toast.makeText(SignUp.this, "Failed to Register. Try Again", Toast.LENGTH_LONG).show();
                                        }
                                }
                            });
                        }else{
                            Toast.makeText(SignUp.this, "Failed to Register. Try Again", Toast.LENGTH_LONG).show();
                        }
                    }
                });



    }
}