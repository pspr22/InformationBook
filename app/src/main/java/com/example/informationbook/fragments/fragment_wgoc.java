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

public class fragment_wgoc extends Fragment {

    public static fragment_wgoc newInstance(){
        return new fragment_wgoc();
    }


    private ImageView imagewgoc;
    private ProgressBar progressBarwgoc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wgoc,container,false);

        imagewgoc = view.findViewById(R.id.innerwgoc);
        progressBarwgoc = view.findViewById(R.id.progressBarwgoc);

        Picasso.get().load("https://cdn.britannica.com/82/94382-050-20CF23DB/Great-Wall-of-China-Beijing.jpg")
                .into(imagewgoc, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwgoc.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwgoc.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
