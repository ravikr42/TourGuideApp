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

public class TempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        final List<Place> places = new ArrayList<>();

        places.add(new Place("ISKCON Temple", "Rajaji Nagar",
                R.mipmap.iskon_temple, R.drawable.iskon_temple, R.string.iskon_address));

        places.add(new Place("Bull Temple", "Basavanagudi",
                R.mipmap.bull_temple, R.drawable.bull_temple, R.string.bull_temple_address));

        places.add(new Place("Sree Surya Narayana Swamy Temple", "Domlur",
                R.mipmap.surayanarayana_temple, R.drawable.surayanarayana_temple, R.string.suryanarayna_address));

        places.add(new Place("Sri Shirdi Sai Mandira", "R. T. Nagar",
                R.mipmap.shirdi_sai_temple, R.drawable.shirdi_sai_temple, R.string.sirdi_sai_blore_address));

        places.add(new Place("Kote Venkataramana Swamy Temple", "Kalasipalya",
                R.mipmap.kote_venkat_temple, R.drawable.kote_venkat_temple, R.string.kote_venkat_address));

        places.add(new Place("St. Andrew's Church", "Cubbon Road",
                R.mipmap.andrew_church, R.drawable.andrew_church, R.string.andrew_church_address));

        places.add(new Place("Dwadasha Jyotirlinga Temple", "Shrinivasapura",
                R.mipmap.dwadasha_jyotirlinga, R.drawable.dwadasha_jyotirlinga, R.string.dwadsha_jyortilinga_address));

        places.add(new Place("Pyramid Valley International", "Kanakapura Taluk",
                R.mipmap.pyramid_valley, R.drawable.pyramid_valley, R.string.pyramid_address));

        places.add(new Place("St. Mark's Cathedral", "M.G. Road",
                R.mipmap.st_marks_cathedral, R.drawable.st_marks_cathedral, R.string.st_marks_address));

        places.add(new Place("Ragigudda Anjaneya Temple", "Jayanagar",
                R.mipmap.ragiguda_anj_temple, R.drawable.ragiguda_anj_temple, R.string.ragiguda_anjneya_address));

        places.add(new Place("Infant Jesus Church", "Viveka Nagar",
                R.mipmap.infant_jesus, R.drawable.infant_jesus, R.string.infant_jesus_address));

        places.add(new Place("Art of Living, International", "Kanakapura Taluk",
                R.mipmap.art_of_living, R.drawable.art_of_livinf, R.string.art_of_living_address));


        final PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.temples_color);
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
