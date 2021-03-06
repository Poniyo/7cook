package com.example.rayola.myapplication.multitheredinggh11;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.rayola.myapplication.R;

public class MainTheredActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thered);

        final Button startThreadButton=findViewById(R.id.button_main_thread);

        startThreadButton.post(new Runnable() {
            @Override
            public void run() {
               //  Log.i("Handler", "onCreate: Button Width=> " +startThreadButton.getWidth());
            }
        });

        startThreadButton.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("Handler", "onCreate: Button Width=> " +startThreadButton.getWidth());
            }
        },1000);
    }

    private void startThread() {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
    }

    private void startRunnable() {
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        Thread thread = new Thread(simpleRunnable);
        thread.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //do some work
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //Update Ui
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_main_thread:
                startThread();
            case R.id.button_main_runnable:
                startRunnable();
            case R.id.button_main_asyncTask:
                AsyncTaskSample asyncTaskSample=new AsyncTaskSample();
                asyncTaskSample.execute();
        }
    }

    private class  AsyncTaskSample extends AsyncTask<Void,Integer,Void>{
        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog=new ProgressDialog(MainTheredActivity.this);
            progressDialog.setTitle("Do Work...");
            progressDialog.setMessage("Please Wait...");
            //progressDialog.setIndeterminate(false);
            progressDialog.setProgress(0);
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                onProgressUpdate(i);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressDialog.setProgress(values[0]);
            progressDialog.setMessage("Please Wait..." +values[0]+"%");
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();
        }
    }
}
