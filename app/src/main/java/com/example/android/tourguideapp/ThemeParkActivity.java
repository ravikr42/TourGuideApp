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

        places.add(new Place(getString(R.string.wonderla_park),
                getString(R.string.wonderla_park_area), R.mipmap.wonderla, R.drawable.wonderla, R.string.wonderla_park_address));

        places.add(new Place(getString(R.string.fun_world),
                getString(R.string.fun_world_area), R.mipmap.funworld, R.drawable.funworld, R.string.fun_world_park_address));

        places.add(new Place(getString(R.string.lumbini_garden),
                getString(R.string.lumbini_garden_area), R.mipmap.lumbini, R.drawable.lumbini, R.string.lumbini_garden_address));

        places.add(new Place(getString(R.string.inno_film_city),
                getString(R.string.inno_film_city_area), R.mipmap.innovative, R.drawable.innovative, R.string.innovative_film_city_address));

        places.add(new Place(getString(R.string.snow_city),
                getString(R.string.snow_city_area), R.mipmap.snow_city, R.drawable.snow_city, R.string.snow_city_address));

        places.add(new Place(getString(R.string.star_city),
                getString(R.string.star_city_area), R.mipmap.star_city, R.drawable.star_city, R.string.star_city_address));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.themepark_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Intent themeParkIntent = new Intent(view.getContext(), PlaceInfoActivity.class);
                themeParkIntent.putExtra(getString(R.string.place_name_key), place.getPlaceName());
                themeParkIntent.putExtra(getString(R.string.image_resource_key), place.getBigImageResourceId());
                themeParkIntent.putExtra(getString(R.string.place_address_key), getString(place.getAddressResourceId()));
                startActivity(themeParkIntent);
            }
        });
    }
}
