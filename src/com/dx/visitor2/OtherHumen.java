package com.dx.visitor2;

public class OtherHumen implements  Humen{
    @Override
    public void visit(DogPet dogPet) {
        System.out.println("喂狗吃狗粮");
    }

    @Override
    public void visit(CatPet catPet) {
        System.out.println("喂猫是馒头");
    }
}
