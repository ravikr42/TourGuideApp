package com.example.android.tourguideapp.pojo;

/**
 * Created by ravik on 2/17/2018.
 */

public class Place {

    public static final String PLACE_INFO = "*Tap to get more information";

    private String placeName;
    private String placeAreaName;
    private int imageResourceId;

    public Place(String placeName, String placeAreaName, int imageResourceId) {
        this.placeName = placeName;
        this.placeAreaName = placeAreaName;
        this.imageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAreaName() {
        return placeAreaName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
