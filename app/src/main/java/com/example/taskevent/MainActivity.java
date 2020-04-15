package com.example.taskevent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToSignUp(View view) {

        Intent i = new Intent(this, Signup.class);
        startActivity(i);

    }

    public void clickToLogin(View view) {

        Intent itologin = new Intent(this, Login.class);
        startActivity(itologin);

    }
}
