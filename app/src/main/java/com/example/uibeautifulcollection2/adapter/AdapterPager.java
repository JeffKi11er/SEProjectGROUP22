package com.example.uibeautifulcollection2.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.uibeautifulcollection2.fragment.FragmentBooked;
import com.example.uibeautifulcollection2.fragment.FragmentEmergency;
import com.example.uibeautifulcollection2.fragment.FragmentHome;
import com.example.uibeautifulcollection2.fragment.FragmentTour;


public class AdapterPager extends FragmentPagerAdapter {
    public AdapterPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final Fragment result;
        switch (position){
            case 0 :
                result = new FragmentHome();
                break;
            case 1 :
                result = new FragmentBooked();
                break;
            case 2 :
                result = new FragmentEmergency();
                break;
            default:
                result = new FragmentTour();
                break;
        }
        return result;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Trang chủ";
        }
        if(position==1){
            return "Giỏ hàng (0)";
        }
        if(position==2){
            return "Khuyến mãi";
        }
        return "Liên hệ";
    }
}
