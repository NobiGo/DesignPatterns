package com.dx.visitor;

public class SingleVisitor implements Visitor {
    @Override
    public void visit(BeiJing beiJing) {
        System.out.println("Hello BeiJing");
    }

    @Override
    public void visit(ShangHai shangHai) {
        System.out.println("Hello Shanghai");
    }

    @Override
    public void visit(ShenZhen shenZhen) {
        System.out.println("Hello ShenZhen");
    }
}
