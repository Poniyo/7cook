package com.example.rayola.myapplication.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentStatePagerAdapterSample extends FragmentStatePagerAdapter {
    public FragmentStatePagerAdapterSample(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentAli();
            case 1:
                return new FragmentMasoud();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
