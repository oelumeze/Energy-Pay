package com.example.root.energypay;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private NavItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.front_activity);

        List<NavItems> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.navlist);
        NavItemAdapter adapter = new NavItemAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public List<NavItems> fill_with_data() {

        List<NavItems> data = new ArrayList<>();

        data.add(new NavItems(R.mipmap.ic_launcher, "Pay Bill"));
        data.add(new NavItems(R.mipmap.ic_launcher, "Pay History"));
        data.add(new NavItems(R.mipmap.ic_launcher, "Complaint"));
        data.add(new NavItems(R.mipmap.ic_launcher, "Settings"));

        return data;
    }


}
