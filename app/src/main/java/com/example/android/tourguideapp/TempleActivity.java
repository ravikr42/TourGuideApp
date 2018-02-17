package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.tourguideapp.adaptors.PlaceAdaptor;
import com.example.android.tourguideapp.pojo.Place;

import java.util.ArrayList;
import java.util.List;

public class TempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        List<Place> places = new ArrayList<>();

        places.add(new Place("dsfg", "sdfgs", R.drawable.iskon_temple));
        places.add(new Place("dsfg", "sdfgs", R.drawable.iskon_temple));
        places.add(new Place("dsfg", "sdfgs", R.drawable.iskon_temple));
        places.add(new Place("dsfg", "sdfgs", R.drawable.iskon_temple));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(placeAdaptor);
    }
}
