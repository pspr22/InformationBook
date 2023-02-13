package com.example.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.R;
import com.example.informationbook.apaters.ViewPageAdapterCountries;
import com.example.informationbook.apaters.ViewPageAdapterWonders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class wondersActivity extends AppCompatActivity {

    private TabLayout tablayoutwonders;
    private ViewPager2 viewPager2wonders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tablayoutwonders = findViewById(R.id.tabLayoutwonders);
        viewPager2wonders = findViewById(R.id.viewgroupwonders);


        ViewPageAdapterWonders adapter = new ViewPageAdapterWonders(getSupportFragmentManager(),
                getLifecycle());
        viewPager2wonders.setAdapter(adapter);


        TabLayoutMediator  tabLayoutMediator = new TabLayoutMediator(tablayoutwonders,viewPager2wonders
                ,true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        tab.setText("Taj Mahal");
                        break;
                    case 1:
                        tab.setText("Great Wall Of China");
                        break;
                    case 2:
                        tab.setText("Machu Picchu");
                        break;
                    case 3:
                        tab.setText("Petra");
                        break;
                    case 4:
                        tab.setText("Colosseum");
                        break;
                    case 5:
                        tab.setText("Chichén Itzá");
                        break;
                    case 6:
                        tab.setText("Christ the Redeemer");
                        break;

                }
            }
        });

        tabLayoutMediator.attach();



    }
}