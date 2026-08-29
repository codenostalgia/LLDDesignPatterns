package com.patterns.structural.bridge.device;

public class TV implements Device {

    @Override
    public String getName() {
        return "TV";
    }

    @Override
    public void turnON() {
        System.out.println("Turned ON TV");
    }

    @Override
    public void turnOFF() {
        System.out.println("Turned OFF TV");
    }
}
