package com.patterns.structural.decoratorpattern.decorators;

import com.patterns.structural.decoratorpattern.base.Pizza;

public class ExtraCheese extends PizzaDecorator {

    public static final int EXTRA_CHEESE_COST = 20;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + EXTRA_CHEESE_COST;
    }
}
