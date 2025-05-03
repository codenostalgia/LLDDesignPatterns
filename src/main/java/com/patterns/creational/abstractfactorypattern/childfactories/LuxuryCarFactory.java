package com.patterns.creational.abstractfactorypattern.childfactories;

import com.patterns.creational.abstractfactorypattern.Car;
import com.patterns.creational.abstractfactorypattern.basefactory.CarFactory;
import com.patterns.creational.abstractfactorypattern.luxurycars.*;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Car getCar(String model) {
        switch (model) {
            case "BMW":
                return new BMW();
            case "MERCEDES":
                return new Mercedes();
            default:
                return null;
        }
    }
}
