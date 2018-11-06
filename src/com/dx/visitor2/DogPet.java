package com.dx.visitor2;

public class DogPet implements AnimalPet{
    @Override
    public void accept(Humen humen) {
        humen.visit(this);
    }
}
