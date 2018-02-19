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

public class ResortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final List<Place> places = new ArrayList<>();

        places.add(new Place("The Golden Palms",
                " Off Tumkur Road",
                R.mipmap.golden_palms, R.drawable.golden_palms, R.string.the_golden_palms_address));

        places.add(new Place("Guhantara Resort",
                "Kaggalipura",
                R.mipmap.guhantra, R.drawable.guhantra, R.string.guhantra_resort_address));

        places.add(new Place("Windflower Prakruthi Resort & Spa",
                "Devanahalli Taluk",
                R.mipmap.windflower, R.drawable.windflower, R.string.windflower_prakurti_address));

        places.add(new Place("Discovery Villege",
                "Kanakpura", R.mipmap.discovery,
                R.drawable.discovery, R.string.discovery_village_address));

        places.add(new Place("Wonderla Resort",
                "Mysore Road", R.mipmap.wonderla_resort,
                R.drawable.wonderla_resort, R.string.wonderla_resort_address));

        places.add(new Place("Clark's Exotica",
                "Devanahalli Road", R.mipmap.clarks_exotica_resort,
                R.drawable.clarks_exotica_resort, R.string.clarks_exotica_address));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.resorts_color);
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
