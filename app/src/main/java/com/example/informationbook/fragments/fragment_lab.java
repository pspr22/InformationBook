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

public class fragment_lab extends Fragment {

    public static fragment_lab newInstance(){
        return new fragment_lab();
    }


    private ImageView imagelab;
    private ProgressBar progressBarlab;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lab,container,false);

        imagelab = view.findViewById(R.id.innerlab);
        progressBarlab = view.findViewById(R.id.progressBarlab);

        Picasso.get().load("https://www.timeforkids.com/wp-content/uploads/2018/06/heroGettyImages-1308080.jpg")
                .into(imagelab, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarlab.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarlab.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
