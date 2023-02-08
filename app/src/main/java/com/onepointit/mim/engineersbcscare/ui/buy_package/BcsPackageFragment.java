package com.onepointit.mim.engineersbcscare.ui.buy_package;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.onepointit.mim.engineersbcscare.R;

public class BcsPackageFragment extends Fragment {

    public BcsPackageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_bcs_package, container, false);

        return root;
    }
}