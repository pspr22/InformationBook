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

public class fragment_uk extends Fragment {

    public static fragment_uk newInstance(){
        return new fragment_uk();
    }


    private ImageView imageuk;
    private ProgressBar progressBaruk;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_uk,container,false);

        imageuk = view.findViewById(R.id.inneruk);
        progressBaruk = view.findViewById(R.id.progressBaruk);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/"+
                "Flag_of_the_United_Kingdom.svg/2560px-Flag_of_the_United_Kingdom.svg.png")
                .into(imageuk, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBaruk.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBaruk.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
