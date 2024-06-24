package com.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    public Parrot() {
        System.out.println("Parrot");
    }

    public void speak() {
        System.out.println("Speak PARROT " + this);
    }
}
