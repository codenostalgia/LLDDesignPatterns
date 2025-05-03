package com.patterns.creational.abstractfactorypattern.childfactories;

import com.patterns.creational.abstractfactorypattern.Car;
import com.patterns.creational.abstractfactorypattern.basefactory.CarFactory;
import com.patterns.creational.abstractfactorypattern.normalcars.*;

public class NormalCarFactory implements CarFactory {
    @Override
    public Car getCar(String model) {
        switch (model){
            case "HONDA":
                return new Honda();
            case "SWIFT":
                return new Swift();
            default:
                return null;
        }
    }
}
