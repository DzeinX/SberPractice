package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Human {
    private Cat cat;
    private Dog dog;
    private List<Parrot> parrots;

    @Autowired
    public Human(Cat cat, Dog dog, ParrotFirst parrot1, ParrotSecond parrot2) {
        this.cat = cat;
        cat.speak();

        this.dog = dog;
        dog.speak();

        this.parrots = new ArrayList<Parrot>();
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
