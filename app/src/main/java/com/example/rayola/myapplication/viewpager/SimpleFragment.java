package com.example.rayola.myapplication.viewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rayola.myapplication.R;

import java.util.zip.Inflater;

public class SimpleFragment extends Fragment {

    public static final String EXTERA_KEY_POSITION="position";
    private TextView postitionTextView;
    private int position;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position=getArguments().getInt(EXTERA_KEY_POSITION);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_simple,container,false);
        postitionTextView=view.findViewById(R.id.tv_fragment_simple);
        postitionTextView.setText(String.valueOf(position));
        return view;
    }

    public static SimpleFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt(EXTERA_KEY_POSITION,position);
        SimpleFragment fragment = new SimpleFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
