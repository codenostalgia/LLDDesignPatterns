package com.patterns.structural.bridge.remote;

import com.patterns.structural.bridge.device.Device;

public abstract class Remote {

    // bridge
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void turnON() {
        System.out.println("Remote Turning ON: " + device.getName());
        device.turnON();
    }

    public void turnOFF() {
        System.out.println("Remote Turning OFF: " + device.getName());
        device.turnOFF();
    }
}
