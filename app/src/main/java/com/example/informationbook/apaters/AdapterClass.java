package com.example.informationbook.apaters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informationbook.R;
import com.example.informationbook.activities.countriesActivity;
import com.example.informationbook.activities.leaderActivity;
import com.example.informationbook.activities.museumActivity;
import com.example.informationbook.activities.wondersActivity;
import com.example.informationbook.modelClass;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder>{

    private ArrayList<modelClass> modelList;
    private Context context;



    public AdapterClass(ArrayList<modelClass> modelList,Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return  new CardViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder,final int position) {

        modelClass model = modelList.get(position);
        holder.textViewsplash.setText(model.getCategoryName());
        holder.imageviewsplash.setImageResource(context.getResources()
        .getIdentifier(model.getImageName(),"drawable", context.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position == 0){
                    Intent intent = new Intent(context, countriesActivity.class);
                    context.startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(context, leaderActivity.class);
                    context.startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(context, museumActivity.class);
                    context.startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(context, wondersActivity.class);
                    context.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    public class CardViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;


        private ImageView imageviewsplash;
        private TextView textViewsplash;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageviewsplash = itemView.findViewById(R.id.outerimage);
            textViewsplash = itemView.findViewById(R.id.outertext);
            cardView = itemView.findViewById(R.id.card);


        }
    }
}
