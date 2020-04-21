package com.example.uibeautifulcollection2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.uibeautifulcollection2.R;
import com.example.uibeautifulcollection2.adapter.AdapterPager;
import com.example.uibeautifulcollection2.adapter.PagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class FragmentPager extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_page,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewPager = getActivity().findViewById(R.id.view);
        tabLayout = getActivity().findViewById(R.id.tab);
        viewPager.setAdapter(new AdapterPager(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_dashboard);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_favorite);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_person);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_tours);
//        tabLayout.getTabAt(4).setIcon(R.drawable.ic_emergency);
    }
}
