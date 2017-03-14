package com.dx.Observer.push;

/**
 * Created by dx on 2017/3/14.
 */
public class CurrentConditionDisplay implements  Observer{
    Subject subject;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("当前天气情况为：温度为"+temp+"湿度为:"+humidity+"气压为:"+pressure);
    }
}
