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

public class fragment_lmt extends Fragment {

    public static fragment_lmt newInstance(){
        return new fragment_lmt();
    }


    private ImageView imagelmt;
    private ProgressBar progressBarlmt;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lmt,container,false);

        imagelmt = view.findViewById(R.id.innerlmt);
        progressBarlmt = view.findViewById(R.id.progressBarlmt);

        Picasso.get().load("https://cdn.britannica.com/42/155442-004-AEE30B6C/Mother-Teresa.jpg?s=1500x700&q=85")
                .into(imagelmt, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarlmt.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarlmt.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
