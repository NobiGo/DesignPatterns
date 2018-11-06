package com.dx.visitor2;

public class CatPet implements AnimalPet{

    @Override
    public void accept(Humen humen) {
        humen.visit(this);
    }
}
