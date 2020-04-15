package com.example.taskevent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class about_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        ImageView imageg = findViewById(R.id.gmail);
        ImageView imagef = findViewById(R.id.facebook);
        ImageView imagei = findViewById(R.id.instagram);
        ImageView imagew = findViewById(R.id.whatsapp);

        imageg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(about_page.this, "Mail us here", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        imageg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about_page.this, "pranav.prakasan14@gmail.com", Toast.LENGTH_SHORT).show();
            }
        });

        imagef.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(about_page.this, "Like our posts", Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        imagef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about_page.this, "pranav.prakasan14@facebook.com", Toast.LENGTH_SHORT).show();
            }
        });

        imagew.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(about_page.this, "Text us your suggestions here", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        imagew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about_page.this, "8086872709", Toast.LENGTH_SHORT).show();
            }
        });

        imagei.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(about_page.this, "Follow our handles", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        imagei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about_page.this, "prakasan_pranav", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
