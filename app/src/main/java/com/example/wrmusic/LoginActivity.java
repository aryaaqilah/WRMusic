package com.example.wrmusic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class LoginActivity extends AppCompatActivity {

    private TextView errorLabel;
    private EditText usernameEt;
    private EditText passwordEt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        errorLabel = findViewById(R.id.errorLabel);
        usernameEt = findViewById(R.id.usernameField);
        passwordEt = findViewById(R.id.passwordField);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernameEt.getText().toString().equals("")){
                    errorLabel.setText("Username cannot be empty!");
                    errorLabel.setVisibility(View.VISIBLE);
                }else if(passwordEt.getText().toString().equals("")){
                    errorLabel.setText("Password cannot be empty!");
                    errorLabel.setVisibility(View.VISIBLE);
                }else{
                    Intent intent = new Intent(LoginActivity.this, Home.class);
                    startActivity(intent);
                }
            }
        });

//        String username = "";
//
//        if (username.isEmpty()) {
//            errorLabel.setText("Username cannot be empty!");
//            errorLabel.setVisibility(View.VISIBLE);
//        } else {
//            errorLabel.setVisibility(View.GONE);
//        }
    }
}


