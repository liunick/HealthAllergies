package com.example.nl.healthallegeries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.*;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    private Button bMainScan, bMainSettings, bMainLogout;
    private TextView gestureEvent;
    private float x1, x2;
    private float MIN_DISTANCE = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bMainScan = (Button) findViewById(R.id.bMainScan);
        bMainSettings = (Button) findViewById(R.id.bMainSettings);
        bMainLogout = (Button) findViewById(R.id.bMainLogout);

        bMainScan.setOnClickListener(this);
        bMainSettings.setOnClickListener(this);
        bMainLogout.setOnClickListener(this);


    }

    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                float deltaX = x2 - x1;
                if (Math.abs(deltaX) > MIN_DISTANCE && deltaX > 0) {
                    startActivity(new Intent(this, Right.class));
                } else if (Math.abs(deltaX) > MIN_DISTANCE && deltaX < 0){
                    startActivity(new Intent(this, Left.class));
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bMainScan:
                break;
            case R.id.bMainSettings:
                break;
            case R.id.bMainLogout:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
