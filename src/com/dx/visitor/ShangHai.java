package com.dx.visitor;

public class ShangHai implements  City {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
