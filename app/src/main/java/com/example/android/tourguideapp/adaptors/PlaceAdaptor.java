package com.example.android.tourguideapp.adaptors;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.pojo.Place;

import java.util.List;

/**
 * Created by ravik on 2/17/2018.
 */

public class PlaceAdaptor extends ArrayAdapter<Place> {

    private String TAG_LOG = PlaceAdaptor.class.getSimpleName();
    private int mColorResourceId;

    public PlaceAdaptor(Activity context, List<Place> placeList, int colorResourceId){
        super(context, 0, placeList);
        this.mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place place = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_icon);
        imageView.setImageResource(place.getImageResourceId());

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        placeName.setText(place.getPlaceName());

        TextView placeAreaName = (TextView) listItemView.findViewById(R.id.place_area);
        placeAreaName.setText(place.getPlaceAreaName());

//        TextView smallText = (TextView) listItemView.findViewById(R.id.small_text);
//        smallText.setText(Place.PLACE_INFO);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);




        return listItemView;
    }
}
