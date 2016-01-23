package com.example.nl.healthallegeries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button bLoginLogin, bLoginRegister;
    private EditText etLoginUser, etLoginPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bLoginLogin = (Button)findViewById(R.id.bLoginLogin);
        bLoginRegister = (Button)findViewById(R.id.bLoginRegister);
        etLoginUser = (EditText) findViewById(R.id.etLoginUser);
        etLoginPass = (EditText) findViewById(R.id.etLoginPass);

        bLoginLogin.setOnClickListener(this);
        bLoginRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bLoginLogin:
                startActivity(new Intent(this, MainActivity.class)); ;
                break;
            case R.id.bLoginRegister:
                break;
        }
    }
}
