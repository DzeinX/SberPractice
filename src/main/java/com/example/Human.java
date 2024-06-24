package com.example;

import java.util.ArrayList;
import java.util.List;


public class Human {
    private Cat cat;
    private Dog dog;
    private List<Parrot> parrots;

    public Human(Cat cat, Dog dog, Parrot parrot1, Parrot parrot2) {
        this.cat = cat;
        cat.speak();

        this.dog = dog;
        dog.speak();

        this.parrots = new ArrayList<>();
        this.parrots.add(parrot1);
        this.parrots.add(parrot2);

        for (Parrot parrot: parrots) {
            parrot.speak();
        }

        this.speak();

        System.out.println("Human");
    }

    public void speak() {
        System.out.println("Speak HUMAN " + this);
    }
}
