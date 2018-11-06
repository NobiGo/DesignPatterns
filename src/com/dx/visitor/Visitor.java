package com.dx.visitor;

// 在访问者的对象上定义visit方法
public interface Visitor {
    void visit(BeiJing beiJing);
    void visit(ShangHai shangHai);
    void visit(ShenZhen shenZhen);
}
