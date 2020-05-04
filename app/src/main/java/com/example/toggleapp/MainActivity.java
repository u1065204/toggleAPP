package com.example.toggleapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ImageView img_on,img_off;//宣告變數
    private ConstraintLayout conLayout;//宣告變數
    private ToggleButton togButton;//宣告變數
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_on = findViewById(R.id.imageView2);//宣告變數
        img_off = findViewById(R.id.imageView);//宣告變數
        conLayout = findViewById(R.id.layout);//宣告變數
        togButton = findViewById(R.id.toggleButton);//宣告變數

        togButton.setOnCheckedChangeListener(this);//這個toggleButton被按下觸發
        conLayout.setBackgroundColor(Color.parseColor("#FFFF33"));//變成黃色
        img_off.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked) {//如果被按下
            conLayout.setBackgroundColor(Color.parseColor("#000000"));//顯示黑色
            img_off.setVisibility(View.VISIBLE);//顯示
            img_on.setVisibility(View.INVISIBLE);//消失

        }else{
            conLayout.setBackgroundColor(Color.parseColor("#FFFF33"));//顯示黃色
            img_off.setVisibility(View.INVISIBLE);//消失
            img_on.setVisibility(View.VISIBLE);//顯示
        }
    }
}
