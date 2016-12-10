package com.mgabrynowicz.fragmentapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by RENT on 2016-12-10.
 */

public class ApplicationFragment extends Fragment {

    public static ApplicationFragment newInstance() {

        return new ApplicationFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_application, container, false);
        TextView hello = (TextView) view.findViewById(R.id.fragmentTextView);
        hello.setText("no hello for you!");
        return view;
    }
}
