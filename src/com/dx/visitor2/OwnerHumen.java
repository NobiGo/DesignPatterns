package com.dx.visitor2;

public class OwnerHumen  implements Humen{
    @Override
    public void visit(CatPet catPet) {
        System.out.println("喂猫吃鱼");
    }

    @Override
    public void visit(DogPet dogPet) {
        System.out.println("喂狗吃肉");
    }
}
