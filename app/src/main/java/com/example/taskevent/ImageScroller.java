package com.example.taskevent;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ImageScroller extends AppCompatActivity {

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_scroller);

        String[] s = {"Action", "Console", "Adventure", "Beauty", "Comics", "Sports", "Art", "Vehicles", "Games", "Weather", "Landscape", "Events", "Technology"};
        String[] arg = {"Action", "Console", "Adventure", "Beauty", "Comics"};

        Button button = findViewById(R.id.category);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageScroller.this, "Scroll down to see more", Toast.LENGTH_SHORT).show();
            }
        });

        for (int i=0;i<5;i++){
            arg[i] = s[random.nextInt(s.length-1)];
        }

        RecyclerView recyclerView = findViewById(R.id.categoryList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CategoryAdapter(arg));
    }

}
