package com.patterns.behavioral.observerpattern.observable;

import com.patterns.behavioral.observerpattern.observors.TempObserver;

import java.util.ArrayList;
import java.util.List;

public class TempObservableImpl implements TempObservable {

    List<TempObserver> observors;

    int temp = 10;

    public TempObservableImpl() {
        this.observors = new ArrayList<>();
    }

    @Override
    public void add(TempObserver obs) {
        observors.add(obs);
    }

    @Override
    public void remove(TempObserver obs) {
        observors.remove(obs);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Updating observers...");
        for (TempObserver obs : observors) {
            obs.update();
        }
    }

    @Override
    public void setTemp(int temp) {
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public int getTemp() {
        return temp;
    }
}
