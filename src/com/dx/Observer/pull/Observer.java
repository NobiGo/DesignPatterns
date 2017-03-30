package com.dx.observer.pull;

/**
 * Created by dx on 2017/3/14.
 */
//抽象观察者接口，统一获取消息通知的方法
public interface Observer {
    void update(Subject subject);
}
