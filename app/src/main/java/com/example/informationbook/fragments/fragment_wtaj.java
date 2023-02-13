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

public class fragment_wtaj extends Fragment {

    public static fragment_wtaj newInstance(){
        return new fragment_wtaj();
    }


    private ImageView imagewtaj;
    private ProgressBar progressBarwtaj;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wtaj,container,false);

        imagewtaj = view.findViewById(R.id.innerwtaj);
        progressBarwtaj = view.findViewById(R.id.progressBarwtaj);

        Picasso.get().load("https://www.google.com/maps/uv?pb=!1s0x39747121d702ff6d%3A0xdd2ae4803f767dde"+
                "!3m1!7e115!4shttps%3A%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipPwhBCkvBIY5NfEeighvYIBiMeGudV0"+
                "1thRrL4Y%3Dw367-h240-k-no!5staj%20mahal%20-%20Google%20Search!15sCgIgAQ&imagekey=!1e10!2sAF1QipPwh"+
                "BCkvBIY5NfEeighvYIBiMeGudV01thRrL4Y&hl=en&sa=X&ved=2ahUKEwjbz4SA76D6AhV81jgGHd_2AxIQoip6BQiFARAD#")
                .into(imagewtaj, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwtaj.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwtaj.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
