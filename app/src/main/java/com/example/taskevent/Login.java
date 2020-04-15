package com.example.taskevent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void goToAboutUs(View view) {

        Intent itoabout = new Intent(this, about_page.class);
        startActivity(itoabout);

    }

    public void clickImage(View view){
        Intent toScroller = new Intent(this, ImageScroller.class);
        startActivity(toScroller);
    }

}
