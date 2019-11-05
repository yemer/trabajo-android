package com.example.alumno.myapplication.helpes;

import com.example.alumno.myapplication.models.cliente;

import java.util.Observable;

public class MonitorObserbavle extends Observable {
    cliente wachedValue;
    public  MonitorObserbavle (cliente o){
        this.wachedValue=o;
    }

    public void setWachedValue(cliente o) {
      if (o!=null && o.getYear_old() != this.wachedValue.getYear_old()){
          this.wachedValue=o;
          setChanged();
          notifyObservers(o);
      }else{
          setChanged();
          notifyObservers();
      }
    }
}
