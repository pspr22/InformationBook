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

public class fragment_ldal extends Fragment {

    public static fragment_ldal newInstance(){
        return new fragment_ldal();
    }


    private ImageView imageldal;
    private ProgressBar progressBarldal;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ldal,container,false);

        imageldal = view.findViewById(R.id.innerldal);
        progressBarldal = view.findViewById(R.id.progressBarldal);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Dalailama1_20121014_4639.jpg/330px-Dalailama1_20121014_4639.jpg")
                .into(imageldal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarldal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarldal.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
