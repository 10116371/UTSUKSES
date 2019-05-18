package com.example.latihan3prauts.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan3prauts.R;
//17-05-2019.10116371.ArchyRPN,IF-8
public class BiodataFragment extends Fragment {


    public BiodataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layoutss for this fragment
        return inflater.inflate(R.layout.fragment_biodata, container, false);
    }

}
