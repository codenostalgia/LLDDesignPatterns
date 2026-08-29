package com.patterns.structural.adapterpattern.adapter;

import com.patterns.structural.adapterpattern.adaptee.WeighingMachine;
import com.patterns.structural.adapterpattern.adaptee.WeighingMachingImpl;

public class WeighingAdapterImpl implements WeighingAdapter{

    WeighingMachine weighingMachine;

    public WeighingAdapterImpl(){
        weighingMachine = new WeighingMachingImpl();
    }

    @Override
    public double wightInKG() {
        return weighingMachine.weightInPounds()*0.45;
    }
}
