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

public class fragment_wpet extends Fragment {

    public static fragment_wpet newInstance(){
        return new fragment_wpet();
    }


    private ImageView imagewpet;
    private ProgressBar progressBarwpet;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wpet,container,false);

        imagewpet = view.findViewById(R.id.innerwpet);
        progressBarwpet = view.findViewById(R.id.progressBarwpet);

        Picasso.get().load("https://cdn.britannica.com/88/189788-050-9B5DB3A4/Al-Dayr-Petra-Jordan.jpg")
                .into(imagewpet, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwpet.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwpet.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
