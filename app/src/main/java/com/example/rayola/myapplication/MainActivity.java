package com.example.rayola.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.rayola.myapplication.weatherapp.RequestQueueContainer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "masoud", Toast.LENGTH_SHORT).show();

    }
}
