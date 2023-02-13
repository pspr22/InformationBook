package com.example.informationbook.apaters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.fragments.fragment_aus;
import com.example.informationbook.fragments.fragment_france;
import com.example.informationbook.fragments.fragment_india;
import com.example.informationbook.fragments.fragment_uk;
import com.example.informationbook.fragments.fragment_usa;

public class ViewPageAdapterCountries extends FragmentStateAdapter {

    public ViewPageAdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){
            case 0:
                fragment = fragment_india.newInstance();
                break;
            case 1:
                fragment = fragment_uk.newInstance();
                break;
            case 2:
                fragment = fragment_aus.newInstance();
                break;
            case 3:
                fragment = fragment_usa.newInstance();
                break;
            case  4:
                fragment = fragment_france.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
