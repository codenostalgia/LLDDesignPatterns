package com.patterns.structural.adapterpattern;

import com.patterns.structural.adapterpattern.adapter.WeighingAdapter;
import com.patterns.structural.adapterpattern.adapter.WeighingAdapterImpl;

// This pattern is used to support the old legacy code
// It uses Adapter as a bridge between client needs and legacy code
public class Client {

    public static void main(String[] args) {
        WeighingAdapter weighingAdapter = new WeighingAdapterImpl();

        System.out.println(weighingAdapter.wightInKG());
    }
}
