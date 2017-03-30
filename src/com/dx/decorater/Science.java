package com.dx.decorater;

/**
 * Created by dx on 2017/3/30.
 * 具体装饰角色：负责给构件对象贴上附加的责任
 */
public class Science extends GirlDecorator {
    Girl girl;

    public Science(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return "+science" + girl.getDescription();
    }
}
