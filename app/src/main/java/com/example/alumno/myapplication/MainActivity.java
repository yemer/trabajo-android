package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.myapplication.helpes.MonitorObserbavle;
import com.example.alumno.myapplication.helpes.ObserverBind;
import com.example.alumno.myapplication.helpes.callback;
import com.example.alumno.myapplication.models.cliente;
import com.example.alumno.myapplication.presenters.MainPresenters;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {
        Button btnEdad;
        MonitorObserbavle monitorObserbavle;
        ObserverBind observerBind;
        cliente clienteObject;
        MainPresenters MainPresenters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clienteObject=new cliente();
        clienteObject.setYear_old(19);
        btnEdad=(Button)findViewById(R.id.btnedad);
        MainPresenters =new MainPresenters(  this , clienteObject,btnEdad);


         btnEdad.setOnClickListener(new View.OnClickListener() {


       @Override
       public void onClick(View v) {
           clienteObject.setYear_old(clienteObject.getYear_old()+1);
            monitorObserbavle.setWachedValue(clienteObject);
       }
   });
    }

}
