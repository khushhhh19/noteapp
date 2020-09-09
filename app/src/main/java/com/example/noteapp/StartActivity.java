package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import user_sign.LoginActivity;
import user_sign.RegisterActivity;

public class StartActivity extends AppCompatActivity {

    private Button btnReg, btnLog;
    private FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnReg = (Button) findViewById(R.id.start_reg_btn);
        btnLog = (Button) findViewById(R.id.start_log_btn);

        fAuth = FirebaseAuth.getInstance();

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }

    private void register() {
        Intent regIntent = new Intent(StartActivity.this, RegisterActivity.class);
        startActivity(regIntent);
    }

    public void alreadyAcc(View view) {
        Intent logIntent = new Intent(StartActivity.this, LoginActivity.class);
        startActivity(logIntent);

    }
}
