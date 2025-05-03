package com.patterns.behavioral.observerpattern.observable;

import com.patterns.behavioral.observerpattern.observors.TempObserver;

public interface TempObservable {

    void add(TempObserver obs);

    void remove(TempObserver obs);

    public void notifyObservers();

    void setTemp(int temp);

    int getTemp();
}
