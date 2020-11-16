package com.example.nikestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.nikestore.adapter.BestSellerRecylerAdapter;
import com.example.nikestore.adapter.NewReleaseRecylerAdapter;
import com.example.nikestore.model.BestSeller;
import com.example.nikestore.model.NewRelease;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private   RecyclerView recyclerView,recyclerViewbestseller;
    NewReleaseRecylerAdapter newReleaseRecylerAdapter;
    BestSellerRecylerAdapter bestSellerRecylerAdapter;
    List<NewRelease> newReleasesList;
    List<BestSeller> bestSellerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerview);

        recyclerViewbestseller = findViewById(R.id.recyclerviewbestseller);



        newReleasesList = new ArrayList<>();
        NewRelease product1 = new NewRelease("New Air ","","Men","800");
        NewRelease product2 = new NewRelease("New Air ","","Men","800");
        NewRelease product3= new NewRelease("New Air ","","Men","800");
        NewRelease product4 = new NewRelease("New Air ","","Men","800");
        NewRelease product5 = new NewRelease("New Air ","","Men","800");

        newReleasesList.add(product1);
        newReleasesList.add(product2);
        newReleasesList.add(product3);
        newReleasesList.add(product4);
        newReleasesList.add(product5);

        newReleaseRecylerAdapter = new NewReleaseRecylerAdapter(this,newReleasesList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(newReleaseRecylerAdapter);
        newReleaseRecylerAdapter.notifyDataSetChanged();

        bestSellerList = new ArrayList<>();
        BestSeller best1 = new BestSeller("JR AİR","","4.3","670");
        BestSeller best2 = new BestSeller("JR","","4.3","670");
        BestSeller best3 =new BestSeller("JR","","4.3","670");
        BestSeller best4 = new BestSeller("JR","","4.3","670");
        BestSeller best5 = new BestSeller("JR","","4.3","670");

        bestSellerList.add(best1);
        bestSellerList.add(best2);
        bestSellerList.add(best3);
        bestSellerList.add(best4);
        bestSellerList.add(best5);


        bestSellerRecylerAdapter = new BestSellerRecylerAdapter(this,bestSellerList);
        recyclerViewbestseller.setHasFixedSize(false);
        recyclerViewbestseller.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerViewbestseller.setAdapter(bestSellerRecylerAdapter);
        bestSellerRecylerAdapter.notifyDataSetChanged();






    }
}