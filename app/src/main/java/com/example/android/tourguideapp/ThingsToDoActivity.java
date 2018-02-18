package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        List<Place> places = new ArrayList<>();

        places.add(new Place("KR Flower Market",
                "KR Market", R.mipmap.flower_market));

        places.add(new Place("Commercial Street",
                "Shivaji Nagar", R.mipmap.commercial_street));

        places.add(new Place("Bannerghatta National Park",
                "Bannerghatta", R.mipmap.banerghatta_park));

        places.add(new Place("Shivanasamudra Falls",
                "Chamarajanagar", R.mipmap.shivanasamudra));

        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.things_to_do_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);


    }
}
