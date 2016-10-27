package com.example.incresol_078.navigation_drawer_activity;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class SubNotification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_notification);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Sub Notification");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_clear_black_24dp);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}
