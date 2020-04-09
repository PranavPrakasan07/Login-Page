package com.example.taskevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void startActivityLogin(View view) {

        Intent itofirst = new Intent(this, MainActivity.class);
        startActivity(itofirst);

    }
}
