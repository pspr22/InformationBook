package com.example.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.R;
import com.example.informationbook.apaters.ViewPageAdapterCountries;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class countriesActivity extends AppCompatActivity {

    private TabLayout tablayoutcountries;
    private ViewPager2 viewPager2countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tablayoutcountries = findViewById(R.id.tabLayoutcountries);
        viewPager2countries = findViewById(R.id.viewgroupcountries);


        ViewPageAdapterCountries adapter = new ViewPageAdapterCountries(getSupportFragmentManager(),
                getLifecycle());
        viewPager2countries.setAdapter(adapter);


        TabLayoutMediator  tabLayoutMediator = new TabLayoutMediator(tablayoutcountries,viewPager2countries
        ,true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        tab.setText("India");
                        break;
                    case 1:
                        tab.setText("United Kingdom");
                        break;
                    case 2:
                        tab.setText("Australia");
                        break;
                    case 3:
                        tab.setText("USA");
                        break;
                    case 4:
                        tab.setText("France");
                }
            }
        });

        tabLayoutMediator.attach();



    }
}