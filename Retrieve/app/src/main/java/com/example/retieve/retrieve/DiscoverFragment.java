package com.example.retieve.retrieve;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class DiscoverFragment extends Fragment {
    public DiscoverFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_grid, container, false);

        ArrayList<Ad> ads = new ArrayList<Ad>();
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));
        ads.add(new Ad("Prashanth","AED 0",R.drawable.konda));




        AdAdapter adapter = new AdAdapter(getActivity(),ads);


        final GridView listView = (GridView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent adinfo = new Intent(getActivity(),AdInfo.class);
                startActivity(adinfo);
            }
        });

        return rootView;

    }
}