package com.example.uibeautifulcollection2.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.uibeautifulcollection2.fragment.FragmentBooked;
import com.example.uibeautifulcollection2.fragment.FragmentEmergency;
import com.example.uibeautifulcollection2.fragment.FragmentHome;
import com.example.uibeautifulcollection2.fragment.FragmentParticipants;
import com.example.uibeautifulcollection2.fragment.FragmentTour;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final Fragment result;
        switch (position){
            case 0:
                result = new FragmentHome();
                break;
            case 1:
                result = new FragmentBooked();
                break;
            case 2:
                result = new FragmentParticipants();
                break;
            case 3:
                result = new FragmentTour();
                break;
            default:
                result = new FragmentEmergency();
                break;
        }
        return result;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Home";
        }
        if(position==1){
            return "Favorite";
        }
        if(position==2){
            return "Mate";
        }
        if(position==3){
            return "Trends";
        }
        return "Emergency";
    }
}
