package com.cnt.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linearLayout = (LinearLayout) findViewById(R.id.main_layout);
        /*LayoutInflater layoutInflater = LayoutInflater.from(this);
        View buttonLayout = layoutInflater.inflate(R.layout.button,null);
        linearLayout.addView(buttonLayout);*/
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        if(pref.getString("weather",null)!=null){
            Intent intent = new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }


    }

}
