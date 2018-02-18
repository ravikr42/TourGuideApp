package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.tourguideapp.adaptors.PlaceAdaptor;
import com.example.android.tourguideapp.pojo.Place;

import java.util.ArrayList;
import java.util.List;

public class ThemeParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        List<Place> places = new ArrayList<>();

        places.add(new Place("Wonderla Amusement Park",
                "Mysore Road", R.mipmap.wonderla));

        places.add(new Place("Fun World Amusement Park",
                "J.C.Nagar", R.mipmap.funworld));

        places.add(new Place("Lumbini Gardens",
                "Hebbal", R.mipmap.lumbini));

        places.add(new Place("Innovative Film City",
                "Bidali Industrial Area", R.mipmap.innovative));

        places.add(new Place("Snow City",
                "J C Nagar", R.mipmap.snow_city));

        places.add(new Place("Star City",
                "Jayamahal Road", R.mipmap.star_city));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.themepark_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);
    }
}
