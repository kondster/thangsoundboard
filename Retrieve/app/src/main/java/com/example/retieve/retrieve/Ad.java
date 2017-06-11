package com.example.retieve.retrieve;

/**
 * Created by Joaquim Fernandes on 3/4/2017.
 */

public class Ad {
    private String mReward;
    private String mItem;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Ad(String Item, String Reward) {
        mItem = Item;
        mReward = Reward;
    }

    public Ad(String Item, String Reward, int ImageResourceID) {
        mItem = Item;
        mReward = Reward;
        mImageResourceID = ImageResourceID;
    }


    public String getmReward() {
        return mReward;
    }


    public String getmItem() {
        return mItem;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }
    public boolean hasImage(){
        return mImageResourceID!=NO_IMAGE_PROVIDED;
    }
}

