package com.dx.observer.push;

/**
 * Created by dx on 2017/3/14.
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);
}
