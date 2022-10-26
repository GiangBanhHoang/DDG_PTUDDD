package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login(){
        String userName = edtUsername.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (TextUtils.isEmpty(password)) {
            edtPassword.requestFocus();
            edtPassword.setError("Password is empty");
        }
        if (TextUtils.isEmpty(userName)) {
            edtUsername.requestFocus();
            edtUsername.setError("Email is empty");
        }
        if(edtUsername.equals("admin"))
            if(edtPassword.equals("admin")){
                Intent intent = new Intent(this, MainActivity_3.class);
                startActivity(intent);
            }
    }
}