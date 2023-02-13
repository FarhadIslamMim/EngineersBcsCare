package com.onepointit.mim.engineersbcscare.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.R;
import com.onepointit.mim.engineersbcscare.model.MainMenuRecyclerData;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;


public class MainMenuFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<MainMenuRecyclerData> recyclerDataArrayList;

    RecyclerView mainMenu;
    Context context;
    Activity activity;
    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        this.context = context;
        this.activity = ((Activity) context);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main_menu, container, false);
        App.getComponent().inject(this);
        ((AppCompatActivity) context).setTitle("BCS Routine");


        recyclerView=root.findViewById(R.id.mainMenu);

        // created new array list..
        recyclerDataArrayList=new ArrayList<>();

        // added data to array list
        recyclerDataArrayList.add(new MainMenuRecyclerData("Bank Routine",R.drawable.ic_bank_routine));
        recyclerDataArrayList.add(new MainMenuRecyclerData("Exam Section",R.drawable.ic_exam));
        recyclerDataArrayList.add(new MainMenuRecyclerData("Premium Section",R.drawable.ic_premium));
        recyclerDataArrayList.add(new MainMenuRecyclerData("Group Study",R.drawable.ic_groups));
        recyclerDataArrayList.add(new MainMenuRecyclerData("Our Mentors",R.drawable.ic_person));
        recyclerDataArrayList.add(new MainMenuRecyclerData("How to Use ",R.drawable.ic_info));

        // added data from arraylist to adapter class.
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(recyclerDataArrayList,getContext());

        // setting grid layout manager to implement grid view.
        // in this method '2' represents number of columns to be displayed in grid view.
        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);


        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        return root;
    }
}