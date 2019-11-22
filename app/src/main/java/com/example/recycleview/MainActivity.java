package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Items> ItemList = new ArrayList<>();
    private ItemsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerViewHorizontal = findViewById(R.id.RecycleView1);
        RecyclerView recyclerViewVertical = findViewById(R.id.RecycleView2);

        mAdapter = new ItemsAdapter(ItemList);


        //Horizontal
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewHorizontal.setLayoutManager(mlayoutManager);
        recyclerViewHorizontal.setItemAnimator(new DefaultItemAnimator());
        recyclerViewHorizontal.setAdapter(mAdapter);
        List();

        //Vertical
        RecyclerView.LayoutManager mmlayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewVertical.setLayoutManager(mmlayoutManager);
        recyclerViewVertical.setItemAnimator(new DefaultItemAnimator());
        recyclerViewVertical.setAdapter(mAdapter);

    }

    private void List(){
        Items all = new Items("Shazam", "Action, Adventure, Comedy", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("The best of enemies", "Biography, Drama, History", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("Hell Boy", "Action, Adventure, Fantasy", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("Little", "Comedy, fantasy, Romance", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("Avenger : Endgame", "Science Fiction, Action, adventure", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("Avenger : Infinity", "Science Fiction, Action, adventure", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("Pokemon", "Action, Animation, Comedy", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("The Hustle", "Comedy, Crime", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("John Wick chapter 3", "Action, Adventure, comedy", "2019", R.drawable.fivefive);
        ItemList.add(all);

        all = new Items("Aladdin", "Action, Adventure, comedy", "2019", R.drawable.fivefive);
        ItemList.add(all);

        mAdapter.notifyDataSetChanged();

    }
}
