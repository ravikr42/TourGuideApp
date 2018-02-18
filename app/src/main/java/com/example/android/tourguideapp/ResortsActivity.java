package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.tourguideapp.adaptors.PlaceAdaptor;
import com.example.android.tourguideapp.pojo.Place;

import java.util.ArrayList;
import java.util.List;

public class ResortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        List<Place> places = new ArrayList<>();

        places.add(new Place("The Golden Palms",
               " Off Tumkur Road", R.mipmap.golden_palms ));

        places.add(new Place("Guhantara Resort",
                "Kaggalipura", R.mipmap.guhantra));

        places.add(new Place("Windflower Prakruthi Resort & Spa",
                "Devanahalli Taluk", R.mipmap.windflower));

        places.add(new Place("Discovery Villege",
                "Kanakpura", R.mipmap.discovery));

        places.add(new Place("Wonderla Resort",
                "Mysore Road", R.mipmap.wonderla_resort));

        places.add(new Place("Clark's Exotica",
                "Devanahalli Road", R.mipmap.clarks_exotica_resort));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.resorts_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);
    }
}
