package com.dx.Observer.pull;

/**
 * Created by dx on 2017/3/14.
 */
//抽象主题
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
