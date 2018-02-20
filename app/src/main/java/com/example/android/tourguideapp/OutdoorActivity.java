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

public class OutdoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final List<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.Savandurga), getString(R.string.Savandurga_area),
                R.mipmap.savandurga, R.drawable.savandurga, R.string.savandurga_trek_address));

        places.add(new Place(getString(R.string.kunti), getString(R.string.kunti_betta_area),
                R.mipmap.kunti_betta, R.drawable.kunti_betta, R.string.kunti_betta_address));

        places.add(new Place(getString(R.string.anthargange),
                getString(R.string.anthargange_area), R.mipmap.anthargange, R.drawable.anthargange, R.string.antargange_cave_address));

        places.add(new Place(getString(R.string.ramanagara), getString(R.string.ramanagara_area),
                R.mipmap.ramanagara, R.drawable.ramanagara, R.string.ramanagra_trek_address));

        places.add(new Place(getString(R.string.skandagiri),
                getString(R.string.skandagiri_area), R.mipmap.skandagiri, R.drawable.skandagiri, R.string.skandagiri_trek_address));

        places.add(new Place(getString(R.string.madhugiri),
                getString(R.string.madhugiri_area), R.mipmap.madhugiri, R.drawable.madhugiri, R.string.madhugiri_trek_address));

        places.add(new Place(getString(R.string.makalidurga),
                getString(R.string.makalidurga_area), R.mipmap.makalidurga, R.drawable.makalidurga, R.string.makalidurga_trek_address));

        places.add(new Place(getString(R.string.nandi_hills),
                getString(R.string.nandi_hills_area), R.mipmap.nandi_hills, R.drawable.nandi_hills, R.string.nandi_hills_trek_address));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.outdoor_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Intent outdoorIntent = new Intent(view.getContext(), PlaceInfoActivity.class);
                outdoorIntent.putExtra(getString(R.string.place_name_key), place.getPlaceName());
                outdoorIntent.putExtra(getString(R.string.image_resource_key), place.getBigImageResourceId());
                outdoorIntent.putExtra(getString(R.string.place_address_key), getString(place.getAddressResourceId()));
                startActivity(outdoorIntent);
            }
        });
    }
}
