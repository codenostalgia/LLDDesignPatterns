package com.patterns.creational.builderpattern;

// This pattern is used when we have some mandatory and some optional fields
// The Builder class is used to set fields
// And finally build is used to get actual object, by copying fields from builder to actual class
public class Main {

    public static void main(String[] args) {
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder("small");
        builder.addOregano(true).addMushroom(true);

        Pizza pizza = builder.build();

        System.out.println(pizza);
    }
}
