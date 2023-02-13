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

public class fragment_wcol extends Fragment {

    public static fragment_wcol newInstance(){
        return new fragment_wcol();
    }


    private ImageView imagewcol;
    private ProgressBar progressBarwcol;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wcol,container,false);

        imagewcol = view.findViewById(R.id.innerwcol);
        progressBarwcol = view.findViewById(R.id.progressBarwcol);

        Picasso.get().load("https://cdn.britannica.com/36/162636-050-932C5D49/Colosseum-Rome-Italy.jpg")
                .into(imagewcol, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwcol.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwcol.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
