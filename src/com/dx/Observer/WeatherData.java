package com.dx.Observer;

import java.util.ArrayList;

/**
 * Created by dx on 2017/3/14.
 */
public class WeatherData implements  Subject{
    //观察者队列
    ArrayList<Observer> observers = new ArrayList<Observer>();

    private float temp;//定义温度
    private float humidity;//定义湿度
    private float pressure;//定义气压

    public void getMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
          notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
       if(observer instanceof  Observer)
           observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer instanceof  Observer)
            if(observers.contains(observer))
                observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
      for(Observer observer : observers){
          observer.update(temp,humidity,pressure);
      }
    }
}
