package com.example.siri_mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class about extends AppCompatActivity {
    Button menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        menu=findViewById(R.id.menu);
        menu.setOnClickListener(view -> {
            Intent menu_intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(menu_intent);
        });
    }
}