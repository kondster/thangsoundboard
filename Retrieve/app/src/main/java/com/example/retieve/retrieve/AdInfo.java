package com.example.retieve.retrieve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AdInfo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState, Ad ad) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_info);
        Ad currentAd = ad;
        ImageView imageView = (ImageView)findViewById(R.id.imageView2);
        imageView.setImageResource(currentAd.getImageResourceID());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TextView Reward = (TextView)findViewById(R.id.reward);
        Reward.setText(currentAd.getmReward());
        TextView Item = (TextView)findViewById(R.id.item);
        Reward.setText(currentAd.getmItem());

    }

}
