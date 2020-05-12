package com.example.uibeautifulcollection2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uibeautifulcollection2.R;
import com.example.uibeautifulcollection2.adapter.AdapterDashboard;
import com.example.uibeautifulcollection2.item.DashBoardItem;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    private ArrayList<DashBoardItem>dashBoardItems = new ArrayList<>();
    private RecyclerView recyclerView;
    private AdapterDashboard adapterDashboard;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_dashboard,container,false);
        dashBoardItems.add(new DashBoardItem(R.drawable.calendar,"Lịch"));
        dashBoardItems.add(new DashBoardItem(R.drawable.bug,"Báo Lỗi"));
        dashBoardItems.add(new DashBoardItem(R.drawable.chat,"Trò Chuyện"));
        dashBoardItems.add(new DashBoardItem(R.drawable.status,"Tâm Trạng"));
        dashBoardItems.add(new DashBoardItem(R.drawable.emergency,"Khẩn Cấp"));
        dashBoardItems.add(new DashBoardItem(R.drawable.ticket,"Đặt Vé"));
        dashBoardItems.add(new DashBoardItem(R.drawable.your_events,"Sự Kiện"));
        recyclerView = (RecyclerView)v.findViewById(R.id.rcl_dashboard);
        adapterDashboard = new AdapterDashboard(this.getContext(),dashBoardItems);
        recyclerView.setAdapter(adapterDashboard);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        return v;
    }
}
