package com.patterns.creational.builderwithdirectorpattern;

// Director does nothing but seggregates logic to build using specific builder
// Builder will have logic for building, but director knows which functions to call in sequence from the builder,
// to get actual object'
public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder = new CheesePizzaBuilder();
        Director director = new Director(builder);

        Pizza pizza = director.prepareMyPizza();
        System.out.println(pizza);

        PizzaBuilder builder2 = new MushroomPizzaBuilder();
        Director director2 = new Director(builder2);

        Pizza pizza2 = director2.prepareMyPizza();
        System.out.println(pizza2);
    }
}
