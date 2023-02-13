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

public class fragment_wrom extends Fragment {

    public static fragment_wrom newInstance(){
        return new fragment_wrom();
    }


    private ImageView imagewrom;
    private ProgressBar progressBarwrom;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wrom,container,false);

        imagewrom = view.findViewById(R.id.innerwrom);
        progressBarwrom = view.findViewById(R.id.progressBarwrom);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Unique_Moment_with_the_Moon_and_Christ_the_Redeemer_3"+
                ".jpg/1920px-Unique_Moment_with_the_Moon_and_Christ_the_Redeemer_3.jpg")
                .into(imagewrom, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwrom.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwrom.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
