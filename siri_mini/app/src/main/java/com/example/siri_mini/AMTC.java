package com.example.siri_mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AMTC extends AppCompatActivity {
    Button details,joinbtn;
    ImageView clubimg;
    TextView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtc);
        details=findViewById(R.id.details_bttn);
        joinbtn=findViewById(R.id.join_bttn);
        clubimg=findViewById(R.id.img_header);
        TextView title=findViewById(R.id.subtitle_amtc);
        Bundle extras = getIntent().getExtras();
        title.setText(extras.getString("name"));
        clubimg.setImageResource(extras.getInt("logo"));

        about=findViewById(R.id.para);
        about.setText(extras.getString("about"));
        Log.d("check", extras.getString("name"));
        details.setOnClickListener(view->{
            Intent detailsintent=new Intent(Intent.ACTION_VIEW, Uri.parse(extras.getString("details")));
            startActivity(detailsintent);
        });
        joinbtn.setOnClickListener(view->{
            Intent joinintent=new Intent(Intent.ACTION_VIEW,Uri.parse(extras.getString("email")));
            startActivity(joinintent);
        });
    }
}