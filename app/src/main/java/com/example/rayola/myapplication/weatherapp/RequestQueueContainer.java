package com.example.rayola.myapplication.weatherapp;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestQueueContainer {
    public static RequestQueue requestQueue;

    private RequestQueueContainer(){

    }


    public static RequestQueue getRequestQueue(Context context){
        if (requestQueue==null){
            requestQueue =Volley.newRequestQueue(context);
        }
        return  requestQueue;

    }
}
