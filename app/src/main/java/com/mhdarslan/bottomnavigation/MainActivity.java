package com.mhdarslan.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,firstFragment).commit();

//        // to show the notification badges or notification numbers
//        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.secondFragment);
//        badgeDrawable.setVisible(true);
//        badgeDrawable.setNumber(5);

        // ---------------------

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.firstFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,firstFragment).commit();
                        return true;
                    case R.id.secondFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,secondFragment).commit();
                        return true;
                    case R.id.thirdFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,thirdFragment).commit();
                        return true;


                }
                return false;
            }
        });

    }
}