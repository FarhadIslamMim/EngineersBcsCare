package com.onepointit.mim.engineersbcscare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private TextView tvRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        App.getComponent().inject(this);

        btnLogin = findViewById(R.id.btnLogin);
        tvRegistration = findViewById(R.id.tvRegistration);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

                Toast.makeText(LoginActivity.this, "Login Complete", Toast.LENGTH_SHORT).show();
            }
        });
        tvRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),RegistrationActivity.class);
                startActivity(intent);

                Toast.makeText(LoginActivity.this, "clicked registration", Toast.LENGTH_SHORT).show();
            }
        });
    }
}