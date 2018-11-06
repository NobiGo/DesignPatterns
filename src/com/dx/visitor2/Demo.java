package com.dx.visitor2;

public class Demo {
    public static void main(String[] args) {
        FeedingPet feedingPet = new FeedingPet();
        System.out.println("==========================主人================================");
        feedingPet.accept(new OwnerHumen());
        System.out.println("==========================其他人===============================");
        feedingPet.accept(new OtherHumen());
    }
}
