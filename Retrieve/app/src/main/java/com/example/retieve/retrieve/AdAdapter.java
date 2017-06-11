package com.example.retieve.retrieve;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Joaquim Fernandes on 3/4/2017.
 */

public class AdAdapter extends ArrayAdapter<Ad> {

    public AdAdapter(Activity context, ArrayList<Ad> ads) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, ads );
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.ad_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Ad currentAd = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView reward = (TextView) listItemView.findViewById(R.id.reward);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        reward.setText(currentAd.getmReward());




        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView item = (TextView) listItemView.findViewById(R.id.item);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        item.setText(currentAd.getmItem());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentAd.getImageResourceID());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
