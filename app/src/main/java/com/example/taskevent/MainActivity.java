package com.example.taskevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivitySignUp(View view) {

        Intent i = new Intent(this, Signup.class);
        startActivity(i);

    }

    public void startActivityLogin(View view) {

        Intent itologin = new Intent(this, about_page.class);
        startActivity(itologin);

    }
}
