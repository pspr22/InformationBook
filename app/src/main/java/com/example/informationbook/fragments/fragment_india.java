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

public class fragment_india extends Fragment {

    public static fragment_india newInstance(){
        return new fragment_india();
    }


    private ImageView imageindia;
    private ProgressBar progressBarindia;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_india,container,false);

        imageindia = view.findViewById(R.id.innerindia);
        progressBarindia = view.findViewById(R.id.progressBarindia);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/4/"+
                "41/Flag_of_India.svg/1920px-Flag_of_India.svg.png")
                .into(imageindia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarindia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarindia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
