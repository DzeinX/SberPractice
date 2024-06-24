package com.example;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public Cat() {
        System.out.println("Cat");
    }

    public void speak() {
        System.out.println("Speak CAT " + this);
    }
}
