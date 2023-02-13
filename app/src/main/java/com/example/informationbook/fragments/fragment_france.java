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

public class fragment_france extends Fragment {

    public static fragment_france newInstance(){
        return new fragment_france();
    }


    private ImageView imagefrance;
    private ProgressBar progressBarfrance;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_france,container,false);

        imagefrance = view.findViewById(R.id.innerfrance);
        progressBarfrance = view.findViewById(R.id.progressBarfrance);

        Picasso.get().load("https://cdn.britannica.com/82/682-050-8AA3D6A6/Flag-France.jpg")
                .into(imagefrance, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarfrance.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarfrance.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
