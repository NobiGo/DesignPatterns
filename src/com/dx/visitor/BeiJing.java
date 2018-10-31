package com.dx.visitor;

public class BeiJing implements City{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
