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

public class fragment_mlou extends Fragment {

    public static fragment_mlou newInstance(){
        return new fragment_mlou();
    }


    private ImageView imagemlou;
    private ProgressBar progressBarmlou;
    private Button webmlou;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mlou,container,false);

        imagemlou = view.findViewById(R.id.innermlou);
        progressBarmlou = view.findViewById(R.id.progressBarmlou);
        webmlou = view.findViewById(R.id.webmlou);

        Picasso.get().load("https://res.klook.com/images/fl_lossy.progressive,q_65/c_fill,w_1295,h_720/w_80,x_15,y_15,g_south_west,l_Klook_water_br_trans_yhcmh3/activities/zcrg8szmdtntt6y1tapo/TheLouvreMuseumSkip-the-LineGuidedTour.jpg")
                .into(imagemlou, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarmlou.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarmlou.setVisibility(View.INVISIBLE);

                    }
                });

        webmlou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.louvre.fr/en/"));
                startActivity(intent);
            }
        });

        return view;
    }
}
