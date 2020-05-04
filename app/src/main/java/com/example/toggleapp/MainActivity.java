package com.example.toggleapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public abstract class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ImageView b_on;
    private ImageView b_off;
    private LinearLayout layout_bulb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggle =(ToggleButton)findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(this);
        b_off=(ImageView)findViewById(R.id.imgoff);
        b_on=(ImageView)findViewById(R.id.imgon);
        b_off.setVisibility(View.GONE);
        b_on.setVisibility(View.GONE);
        layout_bulb=(LinearLayout)findViewById(R.id.layout);
        layout_bulb.setBackgroundColor(Color.parseColor("#dddddd"));
    }
    protected void onCheckChanged(CompoundButton buttonView, boolean isChecked){
        if (isChecked){
            b_off.setVisibility(View.VISIBLE);
            b_on.setVisibility(View.GONE);
            layout_bulb.setBackgroundColor(Color.parseColor("#666666"));
        }
        else {
            b_on.setVisibility(View.VISIBLE);
            b_off.setVisibility(View.GONE);
            layout_bulb.setBackgroundColor(Color.parseColor("#ffff00"));
        }
    }
}
