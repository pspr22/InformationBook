package com.example.informationbook.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class fragment_msal extends Fragment {

    public static fragment_msal newInstance(){
        return new fragment_msal();
    }


    private ImageView imagemsal;
    private ProgressBar progressBarmsal;
    private Button webmsal;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_msal,container,false);

        imagemsal = view.findViewById(R.id.innermsal);
        progressBarmsal = view.findViewById(R.id.progressBarmsal);
        webmsal = view.findViewById(R.id.webmsal);

        Picasso.get().load("https://img.onmanorama.com/content/dam/mm/en/travel/beyond-kerala/images/2019/5/29/salar-jung-museum.jpg")
                .into(imagemsal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarmsal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarmsal.setVisibility(View.INVISIBLE);

                    }
                });

        webmsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://salarjungmuseum.in/"));
                startActivity(intent);
            }
        });

        return view;
    }
}
