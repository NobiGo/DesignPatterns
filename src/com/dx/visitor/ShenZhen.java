package com.dx.visitor;

public class ShenZhen implements City {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
