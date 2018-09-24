package com.patrickstudio.recyclerviewclickpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final static String CONTENT_EXTRAS = "data";
    private RecyclerView mRecylerView;
    private List<Model> data;
    private RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
        data.add(new Model("Chào"));
        data.add(new Model("I'm"));
        data.add(new Model("vietnamese"));
        data.add(new Model("I love"));
        data.add(new Model("traveling"));
        data.add(new Model("and"));
        data.add(new Model("I love"));
        data.add(new Model("food"));
        data.add(new Model("as well"));
        data.add(new Model("Do u"));
        data.add(new Model("know"));
        data.add(new Model("my name?"));
        mRecylerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        adapter = new RecyclerViewAdapter(data, new RecyclerViewAdapter.ListItemClickListener() {
            @Override
            public void onListItemClickListenter(int clickedItemIndex) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(CONTENT_EXTRAS, data.get(clickedItemIndex).getText());
                startActivity(intent);
            }
        });
        mRecylerView.setAdapter(adapter);
        LinearLayoutManager glm = new LinearLayoutManager(this);
        mRecylerView.setLayoutManager(glm);

    }
}
