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

public class fragment_lmar extends Fragment {

    public static fragment_lmar newInstance(){
        return new fragment_lmar();
    }


    private ImageView imagelmar;
    private ProgressBar progressBarlmar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lmar,container,false);

        imagelmar = view.findViewById(R.id.innerlmar);
        progressBarlmar = view.findViewById(R.id.progressBarlmar);

        Picasso.get().load("https://i.natgeofe.com/n/f0f3505e-a427-453f-814c-696a3831e401/06-martin-luther-king.jpg")
                .into(imagelmar, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarlmar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarlmar.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}

