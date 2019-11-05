package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alumno.myapplication.Activities.LoginActivity;


public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent o = new Intent(this, LoginActivity.class);
        startActivity(o);
        finish();//Esta linea impide que el usuario vuelva con el historial
    }
}
