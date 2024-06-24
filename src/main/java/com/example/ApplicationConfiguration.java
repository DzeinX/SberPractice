package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfiguration {
    @Bean
    public Cat catInitializer() {return new Cat();}

    @Bean
    public Dog dogInitializer() {return new Dog();}

    @Bean
    public Parrot parrot1Initializer() {return new Parrot();}

    @Bean
    public Parrot parrot2Initializer() {return new Parrot();}

    @Bean
    public Human humanInitializer() {
        return new Human(
                catInitializer(),
                dogInitializer(),
                parrot1Initializer(),
                parrot2Initializer()
        );
    }
}
