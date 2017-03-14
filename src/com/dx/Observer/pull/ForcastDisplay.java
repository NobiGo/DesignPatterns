package com.dx.Observer.pull;

/**
 * Created by dx on 2017/3/14.
 */
public class ForcastDisplay implements  Observer{
    private float temp;
    private float humidity;
    private float pressure;
    WeatherData subject;

    public ForcastDisplay(Subject subject){
        this.subject = (WeatherData) subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        this.subject =(WeatherData) subject;
        display();
    }

    public void display(){
        System.out.println("预测湿度为："+subject.getHumidity());
    }


}
