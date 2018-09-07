package com.example.rayola.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class LastNewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_news);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        NewsAdapter newsAdapter=new NewsAdapter(this,DataFakeGenerator.getData(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(newsAdapter);
    }
}
