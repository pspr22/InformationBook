package com.example.informationbook.apaters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.fragments.fragment_aus;
import com.example.informationbook.fragments.fragment_france;
import com.example.informationbook.fragments.fragment_india;
import com.example.informationbook.fragments.fragment_uk;
import com.example.informationbook.fragments.fragment_usa;
import com.example.informationbook.fragments.fragment_wchi;
import com.example.informationbook.fragments.fragment_wcol;
import com.example.informationbook.fragments.fragment_wgoc;
import com.example.informationbook.fragments.fragment_wgp;
import com.example.informationbook.fragments.fragment_wpet;
import com.example.informationbook.fragments.fragment_wrom;
import com.example.informationbook.fragments.fragment_wtaj;

public class ViewPageAdapterWonders extends FragmentStateAdapter {

    public ViewPageAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){
            case 0:
                fragment = fragment_wtaj.newInstance();
                break;
            case 1:
                fragment = fragment_wgoc.newInstance();
                break;
            case 2:
                fragment = fragment_wgp.newInstance();
                break;
            case 3:
                fragment = fragment_wpet.newInstance();
                break;
            case 4:
                fragment = fragment_wcol.newInstance();
                break;
            case 5:
                fragment = fragment_wchi.newInstance();
                break;
            case 6:
                fragment = fragment_wrom.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
