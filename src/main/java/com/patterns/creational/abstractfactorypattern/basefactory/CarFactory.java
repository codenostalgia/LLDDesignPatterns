package com.patterns.creational.abstractfactorypattern.basefactory;

import com.patterns.creational.abstractfactorypattern.Car;

public interface CarFactory {

    Car getCar(String model);
}
