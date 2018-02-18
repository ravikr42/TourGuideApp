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

        places.add(new Place("ISKCON Temple", "Rajaji Nagar", R.mipmap.iskon_temple));
        places.add(new Place("Bull Temple", "Basavanagudi", R.mipmap.bull_temple));
        places.add(new Place("Sree Surya Narayana Swamy Temple", "Domlur", R.mipmap.surayanarayana_temple));
        places.add(new Place("Sri Shirdi Sai Mandira", "R. T. Nagar", R.mipmap.shirdi_sai_temple));
        places.add(new Place("Kote Venkataramana Swamy Temple", "Kalasipalya", R.mipmap.kote_venkat_temple));
        places.add(new Place("St. Andrew's Church", "Cubbon Road", R.mipmap.andrew_church));
        places.add(new Place("Dwadasha Jyotirlinga Temple", "Shrinivasapura", R.mipmap.dwadasha_jyotirlinga));
        places.add(new Place("Pyramid Valley International", "Kanakapura Taluk", R.mipmap.pyramid_valley));
        places.add(new Place("St. Mark's Cathedral", "M.G. Road", R.mipmap.st_marks_cathedral));
        places.add(new Place("Ragigudda Anjaneya Temple", "Jayanagar", R.mipmap.ragiguda_anj_temple));
        places.add(new Place("Infant Jesus Church", "Viveka Nagar", R.mipmap.infant_jesus));
        places.add(new Place("Art of Living, International", "Kanakapura Taluk", R.mipmap.art_of_living));


        PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.temples_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);
    }
}
