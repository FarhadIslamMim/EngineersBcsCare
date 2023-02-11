package com.onepointit.mim.engineersbcscare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;
import com.onepointit.mim.engineersbcscare.model.MainMenuRecyclerData;
import com.onepointit.mim.engineersbcscare.model.User;
import com.onepointit.mim.engineersbcscare.utils.MainMenuConstants;
import com.onepointit.mim.engineersbcscare.utils.SharedPrefsUtils;
import com.onepointit.mim.engineersbcscare.utils.StringConstants;
import com.onepointit.mim.engineersbcscare.utils.TempData;
import com.onepointit.mim.engineersbcscare.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainMenuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<MainMenuRecyclerData> recyclerDataArrayList;
    //dependency injections
    @Inject
    App context;

    //view injections
    @BindView(R.id.mainMenu)
    RecyclerView mainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ButterKnife.bind(this);
        App.getComponent().inject(this);

        recyclerView=findViewById(R.id.mainMenu);

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
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(recyclerDataArrayList,this);

        // setting grid layout manager to implement grid view.
        // in this method '2' represents number of columns to be displayed in grid view.
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);


        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}