package com.example.incresol_078.navigation_drawer_activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Incresol-078 on 15-06-2016.
 */
public class FirstLayoutActivity extends Fragment {
TextView textView;
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.activity_firstlayout,container,false);
        textView=(TextView)myView.findViewById(R.id.textView);
        return myView;

    }
}
