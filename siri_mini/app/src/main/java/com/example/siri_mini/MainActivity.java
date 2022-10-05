package com.example.siri_mini;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Button Tech;
    private Button ecell;
    private Button code;
    private Button phoenix;
    private Button Literary;
    private Button Music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(MainActivity.this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        NavigationView navigationView = findViewById(R.id.navigview);
//        navigationView.setNavigationItemSelectedListener(this);

        Tech = findViewById(R.id.tech);
        ecell = findViewById(R.id.ecell);
        code = findViewById(R.id.code);
        phoenix = findViewById(R.id.phoenix);
        Literary = findViewById(R.id.magazine);
        Music = findViewById(R.id.sambhram);

        Tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, AMTC.class);
                ii.putExtra("value", 1);
                ii.putExtra("name","CSI");
                ii.putExtra("logo",R.drawable.csi);
                ii.putExtra("about","Keeping in mind the interest of the IT professionals & computer users, CSI works towards making the profession an area of choice amongst all sections of the society. The promotion of Information Technology as a profession is the top priority of CSI today. To fulfill this objective, the CSI regularly organizes conferences, conventions, lectures, projects, awards. And at the same time it also ensures that regular training and skill updating are organised for the IT professionals.");
                ii.putExtra("email","mailto:csi.rvitm.2021@gmail.com?subject=Interested in joining in the club&body=Hi,\n" +
                        "\n" +
                        "NAME: [Your name]\n" +
                        "USN: [Your USN. Ex- 1RF19CS052]\n" +
                        "SEMESTER: [Your semester. Ex - 5th Sem]\n" +
                        "BRANCH: [Your branch of engineering. Ex-CSE]\n" +
                        "REASON TO JOIN THE CLUB: [4-5 lines brief about why you're interested to join]\n" +
                        "QUALIFICATIONS: [Any skills you possess that might be utilized in the club]\n" +
                        "ANY PREVIOUS EXPERIENCE: [Any previous projects/articles/reports pertaining to the aforementioned club]\n" +
                        "\n" +
                        "\n" +
                        "Best regards,\n" +
                        "\n" +
                        "[Your name]\n" +
                        "[Your email]");
                ii.putExtra("details","https://vishnucode17.github.io/CSI-test-website/new.html");
                startActivity(ii);
            }
        });


        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this, AMTC.class);
                ia.putExtra("value", 4);
                ia.putExtra("name","Phoenix");
                ia.putExtra("logo",R.drawable.phoenix_logo);
                ia.putExtra("about","Phoenix Robotics is a technical club which strives\n" +
                        "to make a powerful impact on the society and\n" +
                        "focuses on promoting the team’s modern ideas\n" +
                        "and implementing them effectively.");
                ia.putExtra("email","mailto:phoenixrc.rvitm@gmail.com?subject=Interested in joining in the club&body=Hi,\n" +
                        "\n" +
                        "NAME: [Your name]\n" +
                        "USN: [Your USN. Ex- 1RF19CS052]\n" +
                        "SEMESTER: [Your semester. Ex - 5th Sem]\n" +
                        "BRANCH: [Your branch of engineering. Ex-CSE]\n" +
                        "REASON TO JOIN THE CLUB: [4-5 lines brief about why you're interested to join]\n" +
                        "QUALIFICATIONS: [Any skills you possess that might be utilized in the club]\n" +
                        "ANY PREVIOUS EXPERIENCE: [Any previous projects/articles/reports pertaining to the aforementioned club]\n" +
                        "\n" +
                        "\n" +
                        "Best regards,\n" +
                        "\n" +
                        "[Your name]\n" +
                        "[Your email]");
                ia.putExtra("details","https://phoenixrobotics.co.in/");
                startActivity(ia);

            }
        });

        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this, AMTC.class);
                ia.putExtra("value", 3);
                ia.putExtra("name","Sambhram");
                ia.putExtra("logo",R.drawable.sambhram);
                ia.putExtra("about","A spirited community which accents the\n" +
                        "miscellany of talents in the college on all\n" +
                        "platforms the Committee aims to give each\n" +
                        "student an opportunity to exhibit his or her skill in\n" +
                        "the field of dance, music, theatre and sundries.");
                ia.putExtra("email","mailto:sambhram.rvitm@rvei.edu.in?subject=Interested in joining in the club&body=Hi,\n" +
                        "\n" +
                        "NAME: [Your name]\n" +
                        "USN: [Your USN. Ex- 1RF19CS052]\n" +
                        "SEMESTER: [Your semester. Ex - 5th Sem]\n" +
                        "BRANCH: [Your branch of engineering. Ex-CSE]\n" +
                        "REASON TO JOIN THE CLUB: [4-5 lines brief about why you're interested to join]\n" +
                        "QUALIFICATIONS: [Any skills you possess that might be utilized in the club]\n" +
                        "ANY PREVIOUS EXPERIENCE: [Any previous projects/articles/reports pertaining to the aforementioned club]\n" +
                        "\n" +
                        "\n" +
                        "Best regards,\n" +
                        "\n" +
                        "[Your name]\n" +
                        "[Your email]");
                ia.putExtra("details","https://www.instagram.com/sambhram.rv/");
                startActivity(ia);
            }
        });

        ecell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this, AMTC.class);
                ia.putExtra("value", 2);
                ia.putExtra("name","E-Cell");
                ia.putExtra("logo",R.drawable.ecell);
                ia.putExtra("about","The Entrepreneurship Cell (E-Cell) RVITM was\n" +
                        "established with a belief of spreading the spirit of\n" +
                        "entrepreneurship among the students through\n" +
                        "appropriate mentorship, encouragement and\n" +
                        "networking.");
                ia.putExtra("email","mailto:ecell.rvitm@gmail.com?subject=Interested in joining in the club&body=Hi,\n" +
                        "\n" +
                        "NAME: [Your name]\n" +
                        "USN: [Your USN. Ex- 1RF19CS052]\n" +
                        "SEMESTER: [Your semester. Ex - 5th Sem]\n" +
                        "BRANCH: [Your branch of engineering. Ex-CSE]\n" +
                        "REASON TO JOIN THE CLUB: [4-5 lines brief about why you're interested to join]\n" +
                        "QUALIFICATIONS: [Any skills you possess that might be utilized in the club]\n" +
                        "ANY PREVIOUS EXPERIENCE: [Any previous projects/articles/reports pertaining to the aforementioned club]\n" +
                        "\n" +
                        "\n" +
                        "Best regards,\n" +
                        "\n" +
                        "[Your name]\n" +
                        "[Your email]");
                ia.putExtra("details","https://ecellrvitm.in/");
                startActivity(ia);
            }
        });
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this, AMTC.class);
                ia.putExtra("value", 5);
                ia.putExtra("name","Cyberatics");
                ia.putExtra("logo",R.drawable.cyberatics);
                ia.putExtra("about","The coding club is an organization of like-minded\n" +
                        "individuals whose primary motive is to nurture\n" +
                        "the coding culture as part of their entirety.");
                ia.putExtra("email","mailto:cyberaticrvitm@gmail.com?subject=Interested in joining in the club&body=Hi,\n" +
                        "\n" +
                        "NAME: [Your name]\n" +
                        "USN: [Your USN. Ex- 1RF19CS052]\n" +
                        "SEMESTER: [Your semester. Ex - 5th Sem]\n" +
                        "BRANCH: [Your branch of engineering. Ex-CSE]\n" +
                        "REASON TO JOIN THE CLUB: [4-5 lines brief about why you're interested to join]\n" +
                        "QUALIFICATIONS: [Any skills you possess that might be utilized in the club]\n" +
                        "ANY PREVIOUS EXPERIENCE: [Any previous projects/articles/reports pertaining to the aforementioned club]\n" +
                        "\n" +
                        "\n" +
                        "Best regards,\n" +
                        "\n" +
                        "[Your name]\n" +
                        "[Your email]");
                ia.putExtra("details","https://www.cyberaticrvitm.com/");
                startActivity(ia);
            }
        });

        Literary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this, AMTC.class);
                ia.putExtra("value", 6);
                ia.putExtra("name","Anveshana");
                ia.putExtra("logo",R.drawable.anveshana);
                ia.putExtra("about","It is the college magazine that intends to offer a complitation of the events conducted in the college throughtout the year.\n" +
                        "It is a platform to display the creative talents of students and staff alike.");
                ia.putExtra("email","mailto:editorialboard.rvitm@rvei.edu.in?subject=Interested in joining in the club&body=Hi,\n" +
                        "\n" +
                        "NAME: [Your name]\n" +
                        "USN: [Your USN. Ex- 1RF19CS052]\n" +
                        "SEMESTER: [Your semester. Ex - 5th Sem]\n" +
                        "BRANCH: [Your branch of engineering. Ex-CSE]\n" +
                        "REASON TO JOIN THE CLUB: [4-5 lines brief about why you're interested to join]\n" +
                        "QUALIFICATIONS: [Any skills you possess that might be utilized in the club]\n" +
                        "ANY PREVIOUS EXPERIENCE: [Any previous projects/articles/reports pertaining to the aforementioned club]\n" +
                        "\n" +
                        "\n" +
                        "Best regards,\n" +
                        "\n" +
                        "[Your name]\n" +
                        "[Your email]");
                ia.putExtra("details","https://drive.google.com/file/d/16zpYEOv1DyozgLuMNukqa4JqwMBLW8d-/view");
                startActivity(ia);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        int id = menuItem.getItemId();
//
//        switch (id) {
//            case R.id.home:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new society()).commit();
//
//                Toast.makeText(this, "Welcome To Society Page", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.setting:
//                Toast.makeText(this, "Events Page", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(MainActivity.this, Events.class);
//                startActivity(i);
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new events()).commit();
//                break;
//
//            case R.id.logout:
//                Toast.makeText(this, "About Us!!", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new aboutus()).commit();
//                break;
//        }
//
//        mDrawerLayout.closeDrawer(GravityCompat.START);
//
//        return false;
//    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
/*
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
        */
