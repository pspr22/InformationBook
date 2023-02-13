package com.example.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class fragment_lmah extends Fragment {

    public static fragment_lmah newInstance(){
        return new fragment_lmah();
    }


    private ImageView imagelmah;
    private ProgressBar progressBarlmah;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lmah,container,false);

        imagelmah = view.findViewById(R.id.innerlmah);
        progressBarlmah = view.findViewById(R.id.progressBarlmah);

        Picasso.get().load("https://wallpaperaccess.com/full/1392718.jpg")
                .into(imagelmah, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarlmah.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarlmah.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
