package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        List<Place> places = new ArrayList<Place>();

       places.add(new Place("Savandurga",
                "Magadi", R.mipmap.savandurga));

        places.add(new Place("Kunti Betta",
                "Pandavapura", R.mipmap.kunti_betta));

       places.add(new Place("Anthargange Cave",
                "Kolar", R.mipmap.anthargange));

       places.add(new Place("Ramanagara Trek",
                "Ramanagara", R.mipmap.ramanagara));

       places.add(new Place("Skandagiri Trek",
                "Skandagiri", R.mipmap.skandagiri));

       places.add(new Place("Madhugiri Trek",
                "Tumukur", R.mipmap.madhugiri));

       places.add(new Place("Makalidurga trek",
                "Doddaballapura", R.mipmap.makalidurga));

       places.add(new Place("Nandi Hills Trek",
                "Nandi Hills", R.mipmap.nandi_hills));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.outdoor_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);

    }
}
