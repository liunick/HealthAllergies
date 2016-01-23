package com.example.nl.healthallegeries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

public class Right extends AppCompatActivity {

    private float x1, x2;
    private float MIN_DISTANCE = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

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

}
