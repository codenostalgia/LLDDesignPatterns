package com.patterns.structural.bridge;

import com.patterns.structural.bridge.device.TV;
import com.patterns.structural.bridge.remote.BasicRemote;
import com.patterns.structural.bridge.remote.Remote;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV();
        Remote basicRemoteForTV = new BasicRemote(tv);

        basicRemoteForTV.turnON();
    }
}
