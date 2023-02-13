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

public class fragment_lnel extends Fragment {

    public static fragment_lnel newInstance(){
        return new fragment_lnel();
    }


    private ImageView imagelnel;
    private ProgressBar progressBarlnel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lnel,container,false);

        imagelnel = view.findViewById(R.id.innerlnel);
        progressBarlnel = view.findViewById(R.id.progressBarlnel);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Nelson_Mandela_1994.jpg/330px-Nelson_Mandela_1994.jpg")
                .into(imagelnel, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarlnel.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarlnel.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
