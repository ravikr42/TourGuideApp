package com.example.android.tourguideapp.pojo;

/**
 * Created by ravik on 2/17/2018.
 */

public class Place {
    private String placeName;
    private String placeAreaName;
    private int imageResourceId;
    private int bigImageResourceId;
    private int addressResourceId;

    public int getBigImageResourceId() {
        return bigImageResourceId;
    }

    public int getAddressResourceId() {
        return addressResourceId;
    }

    public Place(String placeName, String placeAreaName, int imageResourceId) {
        this.placeName = placeName;
        this.placeAreaName = placeAreaName;
        this.imageResourceId = imageResourceId;
    }

    public Place(String placeName, String placeAreaName, int imageResourceId, int bigImageResourceId, int addressResourceId) {
        this.placeName = placeName;
        this.placeAreaName = placeAreaName;
        this.imageResourceId = imageResourceId;
        this.bigImageResourceId = bigImageResourceId;
        this.addressResourceId = addressResourceId;
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
