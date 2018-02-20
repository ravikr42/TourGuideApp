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
    private int mColorResourceId;

    public PlaceAdaptor(Activity context, List<Place> placeList, int colorResourceId) {
        super(context, 0, placeList);
        this.mColorResourceId = colorResourceId;
    }

    //View Holder Implementation
    static class ViewHolderItem {
        ImageView placeIcon;
        TextView placeName;
        TextView placeAreaName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolderItem viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolderItem();
            viewHolder.placeIcon = (ImageView) convertView.findViewById(R.id.place_icon);
            viewHolder.placeName = (TextView) convertView.findViewById(R.id.place_name);
            viewHolder.placeAreaName = (TextView) convertView.findViewById(R.id.place_area);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolderItem) convertView.getTag();
        }
        Place place = getItem(position);
        if (place != null) {
            viewHolder.placeIcon.setImageResource(place.getImageResourceId());
            viewHolder.placeName.setText(place.getPlaceName());
            viewHolder.placeAreaName.setText(place.getPlaceAreaName());
        }

        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return convertView;
    }

}
