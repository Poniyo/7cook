package com.example.rayola.myapplication.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.example.rayola.myapplication.R;

public class ViewPagerSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_sample);

        ViewPager viewPager=findViewById(R.id.viewPager_viewPagerSample);
        //viewPager.setAdapter(new SimpleFragmentPagerAdapter(getSupportFragmentManager()));
        viewPager.setAdapter(new FragmentStatePagerAdapterSample(getSupportFragmentManager()));
        viewPager.setCurrentItem(9);
        TabLayout tabLayout=findViewById(R.id.tabLayout_viewPagerSample);
        tabLayout.setupWithViewPager(viewPager);

        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.toolbar_sampleViewPagerSample);
        setSupportActionBar(toolbar);
    }
}
