package com.patterns.structural.decoratorpattern.decorators;

import com.patterns.structural.decoratorpattern.base.Pizza;

public class ExtraMushroom extends PizzaDecorator{

    public static final int EXTRA_MUSHROOM_COST = 30;

    public ExtraMushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + EXTRA_MUSHROOM_COST;
    }
}
