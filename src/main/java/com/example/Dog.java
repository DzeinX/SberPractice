package com.example;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public Dog() {
        System.out.println("Dog");
    }


    public void speak() {
        System.out.println("Speak DOG " + this);
    }
}
