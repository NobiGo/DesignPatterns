package com.dx.visitor2;

public class FeedingPet implements AnimalPet{
    AnimalPet [] animalPets;

    public FeedingPet(){
        animalPets = new AnimalPet[]{new DogPet(),new CatPet()};
    }
    @Override
    public void accept(Humen humen) {
        for(AnimalPet pet:animalPets){
            pet.accept(humen);
        }
    }
}
