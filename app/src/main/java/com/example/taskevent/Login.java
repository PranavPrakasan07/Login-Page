package com.example.taskevent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void startActivityLogin(View view) {

        Intent itoabout = new Intent(this, about_page.class);
        startActivity(itoabout);

    }

    public void startActivityAboutUs(View view) {

        Intent itoabout = new Intent(this, about_page.class);
        startActivity(itoabout);

    }

}
