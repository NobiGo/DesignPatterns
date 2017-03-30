package com.dx.decorater;

/**
 * Created by dx on 2017/3/30.
 * 抽象构建角色，给出一个接口，以规范准备接受附加责任的对象
 */
public abstract class Girl {
    private String description = "";

    public String getDescription() {
        return description;
    }
}
