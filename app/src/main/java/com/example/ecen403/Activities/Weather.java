package com.example.ecen403.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecen403.Adapter.HourlyAdapter;
import com.example.ecen403.Domains.Hourly;
import com.example.ecen403.R;

import java.util.ArrayList;

public class Weather extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {

        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("10 pm",28,"cloudy"));
        items.add(new Hourly("11 pm",29,"sun"));
        items.add(new Hourly("12 pm",30,"wind"));
        items.add(new Hourly("1 am",29,"rainy"));
        items.add(new Hourly("2 am",27,"storm"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourly=new HourlyAdapter(items);
        recyclerView.setAdapter(adapterHourly);
    }
}