package com.example.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.R;
import com.example.informationbook.apaters.ViewPageAdapterMuseums;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class museumActivity extends AppCompatActivity {

    private TabLayout tabLayoutmuseum;
    private ViewPager2 viewpagermuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        tabLayoutmuseum = findViewById(R.id.tabLayoutmuseum);
        viewpagermuseum = findViewById(R.id.viewgroupmuseum);

        ViewPageAdapterMuseums adapter = new ViewPageAdapterMuseums(getSupportFragmentManager(),
                getLifecycle());
        viewpagermuseum.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutmuseum, viewpagermuseum,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Musée du Louvre");
                        break;
                    case 1:
                        tab.setText("vatican museum");
                        break;
                    case 2:
                        tab.setText("Tate Modren");
                        break;
                    case 3:
                        tab.setText("shanghai science and technology museum");
                        break;
                    case 4:
                        tab.setText("Salar Jung Museum");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();
    }
}