package com.example.rayola.myapplication.multitheredinggh11;

import android.util.Log;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        Log.i("Thread","Thread Begins , Thread Names=>" +Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("Thread","Thread End");
    }
}
