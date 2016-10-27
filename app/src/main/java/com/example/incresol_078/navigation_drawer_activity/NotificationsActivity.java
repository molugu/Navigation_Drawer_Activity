package com.example.incresol_078.navigation_drawer_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class NotificationsActivity extends AppCompatActivity {
    TextView textView;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mRecyclerViewAdapter;
    private RecyclerView.LayoutManager mRecyclerViewLayoutManager;
    ArrayList<String> myDataSet;

    String[] Notifications={"Notification 01","Notification 02", "Notification 03" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        setTitle("Notifications");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_chevron_left_black_24dp);
        mRecyclerView=(RecyclerView)findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerViewLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mRecyclerViewLayoutManager);
        myDataSet =new ArrayList<String>();
        mRecyclerViewAdapter=new RecyclerViewAdapter(myDataSet);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        addNotifications();
    }

    private void addNotifications(){
        RecyclerViewAdapter myAdapter1=new RecyclerViewAdapter();
        for(int i=0;i<Notifications.length;i++){
            myAdapter1.add(myAdapter1.getItemCount(), Notifications[i]);
            mRecyclerViewAdapter.notifyDataSetChanged();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                break;
        }
        return true;
    }
}
