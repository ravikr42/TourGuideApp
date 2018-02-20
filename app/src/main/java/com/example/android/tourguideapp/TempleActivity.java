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

        places.add(new Place(getString(R.string.iskon), getString(R.string.iskon_area),
                R.mipmap.iskon_temple, R.drawable.iskon_temple, R.string.iskon_address));

        places.add(new Place(getString(R.string.bull_temple), getString(R.string.bull_temple_area),
                R.mipmap.bull_temple, R.drawable.bull_temple, R.string.bull_temple_address));

        places.add(new Place(getString(R.string.surya_narayana_swamy_temple), getString(R.string.surya_narayana_swamy_temple_area),
                R.mipmap.surayanarayana_temple, R.drawable.surayanarayana_temple, R.string.suryanarayna_address));

        places.add(new Place(getString(R.string.shirdi_sai), getString(R.string.shirdi_sai_area),
                R.mipmap.shirdi_sai_temple, R.drawable.shirdi_sai_temple, R.string.sirdi_sai_blore_address));

        places.add(new Place(getString(R.string.venkataramana_temple), getString(R.string.venkataramana_temple_area),
                R.mipmap.kote_venkat_temple, R.drawable.kote_venkat_temple, R.string.kote_venkat_address));

        places.add(new Place(getString(R.string.andrew_church), getString(R.string.andrew_church_area),
                R.mipmap.andrew_church, R.drawable.andrew_church, R.string.andrew_church_address));

        places.add(new Place(getString(R.string.dwadsha_temple), getString(R.string.dwadsha_temple_area),
                R.mipmap.dwadasha_jyotirlinga, R.drawable.dwadasha_jyotirlinga, R.string.dwadsha_jyortilinga_address));

        places.add(new Place(getString(R.string.pyramid_valley), getString(R.string.pyramid_valley_area),
                R.mipmap.pyramid_valley, R.drawable.pyramid_valley, R.string.pyramid_address));

        places.add(new Place(getString(R.string.st_marks), getString(R.string.st_marks_area),
                R.mipmap.st_marks_cathedral, R.drawable.st_marks_cathedral, R.string.st_marks_address));

        places.add(new Place(getString(R.string.ragigudda_anj_temple), getString(R.string.ragigudda_anj_temple_area),
                R.mipmap.ragiguda_anj_temple, R.drawable.ragiguda_anj_temple, R.string.ragiguda_anjneya_address));

        places.add(new Place(getString(R.string.infant_jesus), getString(R.string.infant_jesus_area),
                R.mipmap.infant_jesus, R.drawable.infant_jesus, R.string.infant_jesus_address));

        places.add(new Place(getString(R.string.art_of_living), getString(R.string.art_of_living_area),
                R.mipmap.art_of_living, R.drawable.art_of_livinf, R.string.art_of_living_address));


        final PlaceAdaptor placeAdaptor = new PlaceAdaptor(this, places, R.color.temples_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Intent templeIntent = new Intent(view.getContext(), PlaceInfoActivity.class);
                templeIntent.putExtra(getString(R.string.place_name_key), place.getPlaceName());
                templeIntent.putExtra(getString(R.string.image_resource_key), place.getBigImageResourceId());
                templeIntent.putExtra(getString(R.string.place_address_key), getString(place.getAddressResourceId()));
                startActivity(templeIntent);
            }
        });
    }
}
