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

public class fragment_usa extends Fragment {

    public static fragment_usa newInstance(){
        return new fragment_usa();
    }


    private ImageView imageusa;
    private ProgressBar progressBarusa;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_usa,container,false);

        imageusa = view.findViewById(R.id.innerusa);
        progressBarusa = view.findViewById(R.id.progressBaruusa);

        Picasso.get().load("https://cdn.britannica.com/33/4833-050-F6E415FE/Flag-United-States-of-America.jpg")
                .into(imageusa, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarusa.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarusa.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
