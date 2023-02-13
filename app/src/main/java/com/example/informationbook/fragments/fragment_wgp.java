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

public class fragment_wgp extends Fragment {

    public static fragment_wgp newInstance(){
        return new fragment_wgp();
    }


    private ImageView imagewgp;
    private ProgressBar progressBarwgp;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wgp,container,false);

        imagewgp = view.findViewById(R.id.innerwgp);
        progressBarwgp = view.findViewById(R.id.progressBarwgp);

        Picasso.get().load("https://cdn.britannica.com/30/94530-050-99493FEA/Machu-Picchu.jpg")
                .into(imagewgp, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwgp.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwgp.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
