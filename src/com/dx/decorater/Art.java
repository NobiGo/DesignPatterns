package com.dx.decorater;

/**
 * Created by dx on 2017/3/30.
 */
public class Art extends GirlDecorator {
    Girl girl;

    public Art(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return "+art" + girl.getDescription();
    }
}
