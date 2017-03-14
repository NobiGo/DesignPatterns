package com.dx.Observer.push;

/**
 * Created by dx on 2017/3/14.
 */
public class ForcastDisplay implements  Observer{

    WeatherData weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public ForcastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("预报天气情况为：温度为"+(temp+5)+"湿度为:"+(humidity+4)+"气压为:"+(pressure+3));
    }

}
