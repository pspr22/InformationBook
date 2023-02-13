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

public class fragment_mvm extends Fragment {

    public static fragment_mvm newInstance(){
        return new fragment_mvm();
    }


    private ImageView imagemvm;
    private ProgressBar progressBarmvm;
    private Button webmvm;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mvm,container,false);

        imagemvm = view.findViewById(R.id.innermvm);
        progressBarmvm = view.findViewById(R.id.progressBarmvm);
        webmvm = view.findViewById(R.id.webmvm);

        Picasso.get().load("https://media.tacdn.com/media/attractions-splice-spp-674x446/06/71/30/1c.jpg")
                .into(imagemvm, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarmvm.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarmvm.setVisibility(View.INVISIBLE);

                    }
                });

        webmvm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.museivaticani.va/content/museivaticani/en.html"));
                startActivity(intent);
            }
        });

        return view;
    }
}
