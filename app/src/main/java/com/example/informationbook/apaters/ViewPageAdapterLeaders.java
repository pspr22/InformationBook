package com.example.informationbook.apaters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.fragments.fragment_lab;
import com.example.informationbook.fragments.fragment_ldal;
import com.example.informationbook.fragments.fragment_lmah;
import com.example.informationbook.fragments.fragment_lmar;
import com.example.informationbook.fragments.fragment_lmt;
import com.example.informationbook.fragments.fragment_lnel;
import com.example.informationbook.fragments.fragment_wchi;
import com.example.informationbook.fragments.fragment_wcol;
import com.example.informationbook.fragments.fragment_wgoc;
import com.example.informationbook.fragments.fragment_wgp;
import com.example.informationbook.fragments.fragment_wpet;
import com.example.informationbook.fragments.fragment_wrom;
import com.example.informationbook.fragments.fragment_wtaj;

public class ViewPageAdapterLeaders extends FragmentStateAdapter {

    public ViewPageAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){
            case 0:
                fragment = fragment_lmah.newInstance();
                break;
            case 1:
                fragment = fragment_lab.newInstance();
                break;
            case 2:
                fragment = fragment_lmar.newInstance();
                break;
            case 3:
                fragment = fragment_lmt.newInstance();
                break;
            case 4:
                fragment = fragment_lnel.newInstance();
                break;
            case 5:
                fragment = fragment_ldal.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
