package com.example.steven.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }


    public void interactiveMapButton(View view) {
        startActivity(new Intent(this,InteractiveMap.class));
    }

    public void plantSearchButton(View view) {
        startActivity(new Intent(this,PlantSearch.class));
    }
}
