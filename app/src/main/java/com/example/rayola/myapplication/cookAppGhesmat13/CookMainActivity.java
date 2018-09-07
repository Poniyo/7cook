package com.example.rayola.myapplication.cookAppGhesmat13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Response;
import com.example.rayola.myapplication.R;
import com.example.rayola.myapplication.cookAppGhesmat13.adapters.BannerAdapter;
import com.example.rayola.myapplication.cookAppGhesmat13.data.Banner;

import java.util.List;

public class CookMainActivity extends AppCompatActivity {
    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook_main);

        apiService=new ApiService(this);
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();


        setupViews();
    }

    private void setupViews() {
        getBanners();
    }

    private void getRecipes(){

    }

    private void getCategories(){

    }

    private void getBanners(){
        apiService.getBanners(new Response.Listener<List<Banner>>() {
            @Override
            public void onResponse(List<Banner> response) {
                RecyclerView bannerRv=findViewById(R.id.rv_main_slider);
                bannerRv.setNestedScrollingEnabled(true);
                bannerRv.setLayoutManager(new LinearLayoutManager(CookMainActivity.this,LinearLayoutManager.HORIZONTAL,false));
                bannerRv.setAdapter(new BannerAdapter(response));


                //issue is fixed
            }
        });
    }

}
