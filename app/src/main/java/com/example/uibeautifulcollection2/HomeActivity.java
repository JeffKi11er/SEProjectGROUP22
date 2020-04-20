package com.example.uibeautifulcollection2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private DrawerLayout drawerLayout;
    private NavigationView navView;
    private FrameLayout container;
    private ImageView imgButtonBar;
    private ImageView imgButtonSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    private void init() {
        imgButtonBar = (ImageView)findViewById(R.id.img_buttons);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        navView = (NavigationView)findViewById(R.id.navigation_view);
        imgButtonSearch = (ImageView)findViewById(R.id.img_btn_search);
        imgButtonBar.setOnClickListener(this);
        imgButtonSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_btn_search:
                break;
            case R.id.img_buttons:
                drawerLayout.openDrawer(navView);
                break;
        }
    }
}
