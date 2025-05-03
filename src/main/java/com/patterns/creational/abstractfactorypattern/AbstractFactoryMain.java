package com.patterns.creational.abstractfactorypattern;

import com.patterns.creational.abstractfactorypattern.basefactory.BaseFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        BaseFactory factory = new BaseFactory();

        Car honda = factory.getCarFactory("NORMAL").getCar("HONDA");

        System.out.println(honda.getClass().getName());

    }
}
