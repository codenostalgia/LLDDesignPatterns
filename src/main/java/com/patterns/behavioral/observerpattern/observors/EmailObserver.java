package com.patterns.behavioral.observerpattern.observors;

import com.patterns.behavioral.observerpattern.observable.TempObservable;

public class EmailObserver implements TempObserver {

    TempObservable observable;

    public  EmailObserver(TempObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        // code to send msg about temperature change
        System.out.println("I will send email: " + observable.getTemp());
    }
}
