package com.patterns.creational.factorypattern;

import com.patterns.creational.factorypattern.shapes.Shape;

public class FactoryPatternMain {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("RECTANGLE");
        Shape shape2 = factory.getShape("CIRCLE");

        shape1.printName();
        shape2.printName();
    }
}
