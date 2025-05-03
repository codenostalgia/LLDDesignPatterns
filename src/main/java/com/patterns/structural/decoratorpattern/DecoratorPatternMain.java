package com.patterns.structural.decoratorpattern;

import com.patterns.structural.decoratorpattern.base.Pizza;
import com.patterns.structural.decoratorpattern.base.Margherita;
import com.patterns.structural.decoratorpattern.decorators.ExtraCheese;
import com.patterns.structural.decoratorpattern.decorators.ExtraCorn;
import com.patterns.structural.decoratorpattern.decorators.ExtraMushroom;

public class DecoratorPatternMain {

    public static void main(String[] args) {


        Pizza pizza = new Margherita(); //200

        // Adding Cheese
        pizza = new ExtraCheese(pizza); // 20

        //Adding Mushroom
        pizza = new ExtraMushroom(pizza); //30

        // Adding Cheese again
        pizza = new ExtraCheese(pizza); //20

        // Adding corn
        pizza = new ExtraCorn(pizza); //50

        System.out.println("Final price: " + pizza.cost()); // 200+20+30+20+50
    }
}
