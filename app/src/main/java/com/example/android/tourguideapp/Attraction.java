package com.example.android.tourguideapp;

public class Attraction {

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mTitleAttraction;

    private int mOverviewAttraction;

    private int mImageResourceId;

    public Attraction(int titleAttraction, int overviewAttraction, int imageResourceId) {
        mTitleAttraction = titleAttraction;
        mOverviewAttraction = overviewAttraction;
        mImageResourceId = imageResourceId;
    }

    public int getTitleAttraction() {
        return mTitleAttraction;
    }

    public int getOverviewAttraction() {
        return mOverviewAttraction;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
