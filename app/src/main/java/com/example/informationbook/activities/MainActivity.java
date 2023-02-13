package com.example.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.informationbook.apaters.AdapterClass;
import com.example.informationbook.R;
import com.example.informationbook.modelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<modelClass> arrayList = new ArrayList<>();
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);


        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));


        modelClass modelclass1 = new modelClass("countries","The Countries");
        modelClass modelclass2 = new modelClass("leaders","The Leaders");
        modelClass modelclass3 = new modelClass("museum","The Museum");
        modelClass modelclass4 = new modelClass("wonders","The Seven Wonders of the World");


        arrayList.add(modelclass1);
        arrayList.add(modelclass2);
        arrayList.add(modelclass3);
        arrayList.add(modelclass4);

        adapter = new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);



    }
}