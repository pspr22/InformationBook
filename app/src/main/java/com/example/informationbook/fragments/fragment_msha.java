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

public class fragment_msha extends Fragment {

    public static fragment_msha newInstance(){
        return new fragment_msha();
    }


    private ImageView imagemsha;
    private ProgressBar progressBarmsha;
    private Button webmsha;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_msha,container,false);

        imagemsha = view.findViewById(R.id.innermsha);
        progressBarmsha = view.findViewById(R.id.progressBarmsha);
        webmsha = view.findViewById(R.id.webmsha);

        Picasso.get().load("https://cdn.crtkl.com/wp-content/uploads/sites/1/2015/09/shanghai-science-and-technology-museum-2.jpg")
                .into(imagemsha, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarmsha.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarmsha.setVisibility(View.INVISIBLE);

                    }
                });

        webmsha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sstm.org.cn/"));
                startActivity(intent);
            }
        });

        return view;
    }
}
