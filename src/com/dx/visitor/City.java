package com.dx.visitor;

// 被访问的对象上定义accept方法
public interface City {
    void accept(Visitor visitor);
}
