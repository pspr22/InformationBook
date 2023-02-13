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

public class fragment_wchi extends Fragment {

    public static fragment_wchi newInstance(){
        return new fragment_wchi();
    }


    private ImageView imagewchi;
    private ProgressBar progressBarwchi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wchi,container,false);

        imagewchi = view.findViewById(R.id.innerwchi);
        progressBarwchi = view.findViewById(R.id.progressBarwchi);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/"+
                "Chichen-Itza-Castillo-Seen-From-East.JPG/1920px-Chichen-Itza-Castillo-Seen-From-East.JPG")
                .into(imagewchi, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarwchi.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarwchi.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}
