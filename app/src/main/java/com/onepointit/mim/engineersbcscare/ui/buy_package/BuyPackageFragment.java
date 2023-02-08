package com.onepointit.mim.engineersbcscare.ui.buy_package;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.onepointit.mim.engineersbcscare.R;

import org.jetbrains.annotations.NotNull;

public class BuyPackageFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    Context context;
    Activity activity;
    public BuyPackageFragment() {
        // Required empty public constructor
    }

//    @Override
//    public void onAttach(@NonNull @NotNull Context context) {
//        super.onAttach(context);
//        this.context = context;
//        this.activity = ((Activity) context);
//    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_buy_package, container, false);
//
//        ((AppCompatActivity) context).setTitle("Leave");
//


        tabLayout=root.findViewById(R.id.tabLayout);
        viewPager=root.findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("BCS"));
        tabLayout.addTab(tabLayout.newTab().setText("BANK"));

        viewPager.setAdapter(new FragmentPagerAdapter(getActivity().getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

            public Fragment getItem(int position) {

                switch (position){
                    case 0:
                        return new BcsPackageFragment();

                    case 1:
                        return new BankPackageFragment();

                    default:
                        return null;

                }
            }

            @Override
            public int getCount() {
                return tabLayout.getTabCount();
            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }
}