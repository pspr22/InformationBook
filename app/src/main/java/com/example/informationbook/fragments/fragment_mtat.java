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

public class fragment_mtat extends Fragment {

    public static fragment_mtat newInstance(){
        return new fragment_mtat();
    }


    private ImageView imagemtat;
    private ProgressBar progressBarmtat;
    private Button webmtat;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mtat,container,false);

        imagemtat = view.findViewById(R.id.innermtat);
        progressBarmtat = view.findViewById(R.id.progressBarmtat);
        webmtat = view.findViewById(R.id.webmtat);

        Picasso.get().load("https://media-cdn.tripadvisor.com/media/photo-s/18/60/db/88/exterior-of-tate-modern.jpg")
                .into(imagemtat, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarmtat.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarmtat.setVisibility(View.INVISIBLE);

                    }
                });

        webmtat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tate.org.uk/visit/tate-modern"));
                startActivity(intent);
            }
        });

        return view;
    }
}
