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

        places.add(new Place(getString(R.string.Savandurga), getString(R.string.Savandurga_Magadi),
                R.mipmap.savandurga, R.drawable.savandurga, R.string.savandurga_trek_address));

        places.add(new Place("Kunti Betta",
                "Pandavapura",
                R.mipmap.kunti_betta, R.drawable.kunti_betta, R.string.kunti_betta_address));

        places.add(new Place("Anthargange Cave",
                "Kolar", R.mipmap.anthargange, R.drawable.anthargange, R.string.antargange_cave_address));

        places.add(new Place("Ramanagara Trek",
                "Ramanagara", R.mipmap.ramanagara, R.drawable.ramanagara, R.string.ramanagra_trek_address));

        places.add(new Place("Skandagiri Trek",
                "Skandagiri", R.mipmap.skandagiri, R.drawable.skandagiri, R.string.skandagiri_trek_address));

        places.add(new Place("Madhugiri Trek",
                "Tumukur", R.mipmap.madhugiri, R.drawable.madhugiri, R.string.madhugiri_trek_address));

        places.add(new Place("Makalidurga trek",
                "Doddaballapura", R.mipmap.makalidurga, R.drawable.makalidurga, R.string.makalidurga_trek_address));

        places.add(new Place("Nandi Hills Trek",
                "Nandi Hills", R.mipmap.nandi_hills, R.drawable.nandi_hills, R.string.nandi_hills_trek_address));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.outdoor_color);
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
