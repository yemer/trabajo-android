package com.example.alumno.myapplication.presenters;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.myapplication.MainActivity;
import com.example.alumno.myapplication.R;
import com.example.alumno.myapplication.helpes.MonitorObserbavle;
import com.example.alumno.myapplication.helpes.ObserverBind;
import com.example.alumno.myapplication.helpes.callback;
import com.example.alumno.myapplication.models.cliente;

import java.util.Observable;

public class MainPresenters {
    Button btnEdad;
    public MainPresenters mainPresenters;
    MonitorObserbavle monitorObserbavle;
    ObserverBind observerBind;



  public MainPresenters(final Context _context , final  cliente clienteObject,final Button btnEdad){
        monitorObserbavle = new MonitorObserbavle(clienteObject);
        observerBind = new ObserverBind();
        observerBind.setCallback(new callback() {
            @Override

            public void dothis(Observable o, Object x) {
                Log.v("bichito", "xxx");
                Toast.makeText(_context ,clienteObject.getYear_old()  , Toast.LENGTH_SHORT ).show();
                btnEdad.setBackgroundColor(Color.parseColor("#bc647d"));
            }
        });


    monitorObserbavle.addObserver(observerBind);

    }
}
