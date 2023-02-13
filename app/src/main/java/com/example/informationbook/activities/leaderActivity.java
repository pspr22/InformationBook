package com.example.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.R;
import com.example.informationbook.apaters.ViewPageAdapterLeaders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class leaderActivity extends AppCompatActivity {

    private TabLayout tablayoutleaders;
    private ViewPager2 viewPager2leaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);

        tablayoutleaders = findViewById(R.id.tabLayoutleaders);
        viewPager2leaders = findViewById(R.id.viewgroupleaders);

        ViewPageAdapterLeaders adapter = new ViewPageAdapterLeaders(getSupportFragmentManager(),getLifecycle());
        viewPager2leaders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tablayoutleaders, viewPager2leaders, true,
                true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch(position){
                    case 0:
                        tab.setText("Mahatma Gandhi");
                        break;
                    case 1:
                        tab.setText("Abraham Lincoln");
                        break;
                    case 2:
                        tab.setText("Martin Luther King Jr");
                        break;
                    case 3:
                        tab.setText("Mother Teresa");
                        break;
                    case 4:
                        tab.setText("Nelson Mandela");
                        break;
                    case 5:
                        tab.setText("Dalai Lama");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();

    }
}