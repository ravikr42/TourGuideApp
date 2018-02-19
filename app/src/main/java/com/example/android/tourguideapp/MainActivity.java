package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView temples = (TextView) findViewById(R.id.temples);
        TextView outdoor = (TextView) findViewById(R.id.outdoor);
        TextView themeParks = (TextView) findViewById(R.id.theme_parks);
        TextView resorts = (TextView) findViewById(R.id.resorts);
        TextView thingsToDo = (TextView) findViewById(R.id.things_to_do);

        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent templesIntent = new Intent(MainActivity.this, TempleActivity.class);
                startActivity(templesIntent);
            }
        });

        outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outdoorIntent = new Intent(MainActivity.this, OutdoorActivity.class);
                startActivity(outdoorIntent);
            }
        });

        themeParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent themeParkIntent = new Intent(MainActivity.this, ThemeParkActivity.class);
                startActivity(themeParkIntent);
            }
        });

        resorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resortsIntent = new Intent(MainActivity.this, ResortsActivity.class);
                startActivity(resortsIntent);
            }
        });

        thingsToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsToDoIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsToDoIntent);
            }
        });
    }
}
