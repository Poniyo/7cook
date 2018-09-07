package com.example.rayola.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TestDebugActivity extends AppCompatActivity {
    private static final String TAG = "TestDebugActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ");
        setContentView(R.layout.activity_test_debug);

        Button implicitButton = (Button) findViewById(R.id.Button_implicit);
        implicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImplicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(intentImplicit);
            }
        });

        Button explicitButton=(Button)findViewById(R.id.Button_explicit);
        explicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExplicit=new Intent(TestDebugActivity.this,MainActivity.class);
                startActivity(intentExplicit);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }
}
