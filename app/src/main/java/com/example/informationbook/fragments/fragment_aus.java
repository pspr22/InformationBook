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

public class fragment_aus extends Fragment {

    public static fragment_aus newInstance(){
        return new fragment_aus();
    }


    private ImageView imageaus;
    private ProgressBar progressBaraus;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aus,container,false);

        imageaus = view.findViewById(R.id.inneraus);
        progressBaraus = view.findViewById(R.id.progressBaraus);

        Picasso.get().load("https://cdn.britannica.com/78/6078-050-18D5DEFE/Flag-Australia.jpg")
                .into(imageaus, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBaraus.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBaraus.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
