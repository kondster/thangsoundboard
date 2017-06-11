package com.example.retieve.retrieve;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DiscoverFragment();
        } else if (position == 1){
            return new LostFragment();
        }
        else {
            return new FoundFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Discover";
        } else if (position == 1) {
            return "Lost";
        } else {
            return "Found";
        }
    }

    @Override
    public int getCount() {return 3;}
}
