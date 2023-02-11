package com.onepointit.mim.engineersbcscare.ui.pdf_section;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.R;

import org.jetbrains.annotations.NotNull;


public class PdfSectionFragment extends Fragment {

    Context context;
    Activity activity;
    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        this.context = context;
        this.activity = ((Activity) context);
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_pdf_section, container, false);
        App.getComponent().inject(this);
        ((AppCompatActivity) context).setTitle("Pdf");
        return root;
    }
}