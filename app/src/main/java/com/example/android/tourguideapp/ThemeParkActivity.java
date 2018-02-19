package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
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

        final List<Place> places = new ArrayList<>();

        places.add(new Place("Wonderla Amusement Park",
                "Mysore Road", R.mipmap.wonderla, R.drawable.wonderla, R.string.wonderla_park_address));

        places.add(new Place("Fun World Amusement Park",
                "J.C.Nagar", R.mipmap.funworld, R.drawable.funworld, R.string.fun_world_park_address));

        places.add(new Place("Lumbini Gardens",
                "Hebbal", R.mipmap.lumbini, R.drawable.lumbini, R.string.lumbini_garden_address));

        places.add(new Place("Innovative Film City",
                "Bidali Industrial Area", R.mipmap.innovative, R.drawable.innovative, R.string.innovative_film_city_address));

        places.add(new Place("Snow City",
                "J C Nagar", R.mipmap.snow_city, R.drawable.snow_city, R.string.snow_city_address));

        places.add(new Place("Star City",
                "Jayamahal Road", R.mipmap.star_city, R.drawable.star_city, R.string.star_city_address));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.themepark_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Intent templeIntent = new Intent(view.getContext(), PlaceInfoActivity.class);
                templeIntent.putExtra("placeName", place.getPlaceName());
                templeIntent.putExtra("imageResource", place.getBigImageResourceId());
                templeIntent.putExtra("placeAddress", getString(place.getAddressResourceId()));
                startActivity(templeIntent);
            }
        });
    }
}
