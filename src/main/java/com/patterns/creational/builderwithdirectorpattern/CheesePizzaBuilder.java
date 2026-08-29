package com.patterns.creational.builderwithdirectorpattern;

public class CheesePizzaBuilder implements PizzaBuilder{

    private Pizza pizza;

    public CheesePizzaBuilder(){
        pizza = new Pizza();
        pizza.setSize("small");
    }

    @Override
    public void addTopping() {
        pizza.setCheese(true);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
