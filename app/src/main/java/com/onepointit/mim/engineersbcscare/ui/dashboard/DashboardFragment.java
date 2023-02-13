package com.onepointit.mim.engineersbcscare.ui.dashboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.R;
import com.onepointit.mim.engineersbcscare.RecyclerViewAdapter;
import com.onepointit.mim.engineersbcscare.model.DashboardRecyclerData;
import com.onepointit.mim.engineersbcscare.model.MainMenuRecyclerData;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;


public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<DashboardRecyclerData> dashboardRecyclerData;

    Context context;
    Activity activity;
    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        this.context = context;
        this.activity = ((Activity) context);
    }
//        @Inject
//        App context;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        App.getComponent().inject(this);

        recyclerView=root.findViewById(R.id.rvDashboard);

        // created new array list..
        dashboardRecyclerData=new ArrayList<>();

        // added data to array list
        dashboardRecyclerData.add(new DashboardRecyclerData("Active Subscription","no",R.drawable.ic_subscription));
        dashboardRecyclerData.add(new DashboardRecyclerData("Live Exam Passed","00",R.drawable.ic_live_exam));
        dashboardRecyclerData.add(new DashboardRecyclerData("Right Answers","00",R.drawable.ic_right_answer));
        dashboardRecyclerData.add(new DashboardRecyclerData("Live Exam Attended","00",R.drawable.ic_live_exam_attendance));
        dashboardRecyclerData.add(new DashboardRecyclerData("Questions","00",R.drawable.ic_question));
        dashboardRecyclerData.add(new DashboardRecyclerData("Wrong Answers ","00",R.drawable.ic_wrong_answer));
        dashboardRecyclerData.add(new DashboardRecyclerData("Card title","no",R.drawable.ic_info));
        dashboardRecyclerData.add(new DashboardRecyclerData("Card title","no",R.drawable.ic_info));

        // added data from arraylist to adapter class.
        DashboardRecyclerViewAdapter adapter=new DashboardRecyclerViewAdapter(dashboardRecyclerData,getContext());

        // setting grid layout manager to implement grid view.
        // in this method '2' represents number of columns to be displayed in grid view.
        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);


        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return root;
    }
}