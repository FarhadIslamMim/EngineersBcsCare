package com.onepointit.mim.engineersbcscare.ui.bcs_routine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.R;


public class BcsRoutineFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_bank_package, container, false);
        App.getComponent().inject(this);

        return root;
    }
}