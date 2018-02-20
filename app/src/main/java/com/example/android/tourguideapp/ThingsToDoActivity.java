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

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final List<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.flower_market),
                getString(R.string.flower_market_area), R.mipmap.flower_market, R.drawable.flower_market, R.string.flower_market_address));

        places.add(new Place(getString(R.string.comm_street),
                getString(R.string.comm_street_area), R.mipmap.commercial_street, R.drawable.commercial_street, R.string.commercial_street_address));

        places.add(new Place(getString(R.string.baneer_nat_park),
                getString(R.string.baneer_nat_park_area), R.mipmap.banerghatta_park, R.drawable.banerghatta_park, R.string.bannerghatta_park_address));

        places.add(new Place(getString(R.string.shiva_falls),
                getString(R.string.shiva_falls_area), R.mipmap.shivanasamudra, R.drawable.shivanasamudra, R.string.shivasamundra_falls_address));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.things_to_do_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Intent thingsToDoIntent = new Intent(view.getContext(), PlaceInfoActivity.class);
                thingsToDoIntent.putExtra(getString(R.string.place_name_key), place.getPlaceName());
                thingsToDoIntent.putExtra(getString(R.string.image_resource_key), place.getBigImageResourceId());
                thingsToDoIntent.putExtra(getString(R.string.place_address_key), getString(place.getAddressResourceId()));
                startActivity(thingsToDoIntent);
            }
        });
    }
}
