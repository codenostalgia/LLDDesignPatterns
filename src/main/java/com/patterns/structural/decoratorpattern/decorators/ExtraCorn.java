package com.patterns.structural.decoratorpattern.decorators;

import com.patterns.structural.decoratorpattern.base.Pizza;

public class ExtraCorn extends PizzaDecorator {

    public static final int EXTRA_CORN_COST = 50;

    public ExtraCorn(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + EXTRA_CORN_COST;
    }
}
