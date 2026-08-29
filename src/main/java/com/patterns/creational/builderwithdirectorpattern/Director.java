package com.patterns.creational.builderwithdirectorpattern;

public class Director {
    PizzaBuilder builder;

    public Director(PizzaBuilder builder) {
        this.builder = builder;
    }

    // in this fiunction, we can also have different logics depending on the builder
    public Pizza prepareMyPizza() {
        builder.addTopping();
        return builder.getPizza();
    }
}
