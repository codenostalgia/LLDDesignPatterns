package com.patterns.creational.builderwithdirectorpattern;

public class MushroomPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public MushroomPizzaBuilder(){
        pizza = new Pizza();
        pizza.setSize("small");
    }

    @Override
    public void addTopping() {
        pizza.setMushroom(true);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
