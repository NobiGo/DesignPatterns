package com.dx.observer.pull;

/**
 * Created by dx on 2017/3/14.
 */
public class TestClass {
    public static void main(String[] args) {
        //新建主题
        WeatherData weatherData = new WeatherData();
        //新建公告板，并将公告板进行注册
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        //更新主题
        weatherData.getMeasurements(12, 34, 56);
    }
}
