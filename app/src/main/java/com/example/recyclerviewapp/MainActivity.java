package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView  recyclerView;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        String[] planets = res.getStringArray( R.array.planets_array );

        recyclerView = findViewById( R.id.recyclerView);
        arrayAdapter = new ArrayAdapter( planets );
        recyclerView.setAdapter( arrayAdapter );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
    }
}
