package com.patterns.creational.abstractfactorypattern.childfactories;

import com.patterns.creational.abstractfactorypattern.Car;
import com.patterns.creational.abstractfactorypattern.basefactory.CarFactory;
import com.patterns.creational.abstractfactorypattern.sportcars.Porsche;

public class SportsCarFactory implements CarFactory {
    @Override
    public Car getCar(String model) {
        switch (model) {
            case "PORSCHE":
                return new Porsche();
            default:
                return null;
        }
    }
}
