package com.example.rayola.myapplication.multitheredinggh11;

import android.util.Log;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        Log.i("Runnable","Runnable Begins , Thread Names=>" +Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("Thread","Runnable End");
    }

}
