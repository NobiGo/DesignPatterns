package com.dx.Observer;

/**
 * Created by dx on 2017/3/14.
 */

/**
 * 抽象主题，用来维护观察者的列表，并提供增加、删除、通知观察者的方法。
 */
public interface Subject {
    //注册
    void registerObserver(Observer observer);
    //注销
    void removeObserver(Observer observer);
    //通知观察者
    void notifyObservers();
}
