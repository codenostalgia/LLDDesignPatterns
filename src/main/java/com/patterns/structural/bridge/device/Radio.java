package com.patterns.structural.bridge.device;

public class Radio implements Device {
    @Override
    public String getName() {
        return "Radio";
    }

    @Override
    public void turnON() {
        System.out.println("Turned ON Radio");
    }

    @Override
    public void turnOFF() {
        System.out.println("Turned OFF Radio");
    }
}
