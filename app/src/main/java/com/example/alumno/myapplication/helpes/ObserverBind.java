package com.example.alumno.myapplication.helpes;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;



public class ObserverBind implements Observer {
    private callback callback;

    @Override
    public void update(Observable o, Object arg){
        Log.v("bichito", "update <<<<<");
        if(this.callback!=null){
            this.callback.dothis(o,arg);
        }
    }

    public void setCallback(callback callback) {
       if (callback==null){
           return;
       }
        this.callback = callback;
    }
}
