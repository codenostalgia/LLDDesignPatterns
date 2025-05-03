package com.patterns.creational.abstractfactorypattern.basefactory;

import com.patterns.creational.abstractfactorypattern.childfactories.LuxuryCarFactory;
import com.patterns.creational.abstractfactorypattern.childfactories.NormalCarFactory;
import com.patterns.creational.abstractfactorypattern.childfactories.SportsCarFactory;

public class BaseFactory {

    public CarFactory getCarFactory(String type) {
        switch (type) {
            case "SPORT":
                return new SportsCarFactory();
            case "LUXURY":
                return new LuxuryCarFactory();
            case "NORMAL":
                return new NormalCarFactory();
            default:
                throw new RuntimeException("Invalid Category!");
        }
    }
}
