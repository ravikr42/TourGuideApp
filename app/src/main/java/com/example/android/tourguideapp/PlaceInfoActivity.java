package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);
        Intent intent = getIntent();
        String placeName = intent.getStringExtra("placeName");
        String placeAddress = intent.getStringExtra("placeAddress").trim();
        int imageResourceId = intent.getIntExtra("imageResource", R.drawable.ic_launcher);

        TextView placeHeader = (TextView) findViewById(R.id.place_header);
        ImageView placeImage = (ImageView) findViewById(R.id.place_image_demonstration);
        TextView address = (TextView) findViewById(R.id.place_address_detail);
        TextView timing = (TextView) findViewById(R.id.place_timing_detail);

        placeHeader.setText(placeName);
        placeImage.setImageResource(imageResourceId);
        address.setText(placeAddress);
        timing.setText(getString(R.string.place_timing_info));
    }
}
