package com.patterns.creational.factorypattern;


import com.patterns.creational.factorypattern.shapes.Circle;
import com.patterns.creational.factorypattern.shapes.Rectangle;
import com.patterns.creational.factorypattern.shapes.Shape;
import com.patterns.creational.factorypattern.shapes.Square;

public class ShapeFactory {

    public Shape getShape(String shape) {
        switch (shape) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                throw new RuntimeException("DOESN'T EXIST !!");
        }
    }
}
