package com.onepointit.mim.engineersbcscare.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.onepointit.mim.engineersbcscare.R;
import com.onepointit.mim.engineersbcscare.model.DashboardRecyclerData;
import com.onepointit.mim.engineersbcscare.model.MainMenuRecyclerData;

import java.util.ArrayList;

public class DashboardRecyclerViewAdapter extends RecyclerView.Adapter<DashboardRecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<DashboardRecyclerData> dashboardRecyclerData;
    private Context mcontext;

    public DashboardRecyclerViewAdapter(ArrayList<DashboardRecyclerData> recyclerDataArrayList, Context mcontext) {
        this.dashboardRecyclerData = recyclerDataArrayList;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard_grid, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        // Set the data to textview and imageview.
        DashboardRecyclerData recyclerData = dashboardRecyclerData.get(position);
        holder.menuText.setText(recyclerData.getTitle());
        holder.menuText2.setText(recyclerData.getTitle2());
        holder.menuIcon.setImageResource(recyclerData.getImgid());


    }

    @Override
    public int getItemCount() {
        // this method returns the size of recyclerview
        return dashboardRecyclerData.size();
    }

    // View Holder Class to handle Recycler View.
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView menuText;
        private TextView menuText2;
        private ImageView menuIcon;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            menuText = itemView.findViewById(R.id.menuText);
            menuText2 = itemView.findViewById(R.id.menuText2);
            menuIcon = itemView.findViewById(R.id.menuIcon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    if (getAdapterPosition()==0){
//                        Toast.makeText(mcontext.getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
//                    }
//                    else if (getAdapterPosition()==1){
//                        Toast.makeText(mcontext.getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
//                    }
//                    else if (getAdapterPosition()==2){
//                        Toast.makeText(mcontext.getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
//                    }
//                    else if (getAdapterPosition()==3){
//                        Toast.makeText(mcontext.getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
//                    }
//                    else if (getAdapterPosition()==4){
//                        Toast.makeText(mcontext.getApplicationContext(), "5", Toast.LENGTH_SHORT).show();
//                    }
//                    else if (getAdapterPosition()==5){
//                        Toast.makeText(mcontext.getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
//                    }
                }
            });
        }
    }
}