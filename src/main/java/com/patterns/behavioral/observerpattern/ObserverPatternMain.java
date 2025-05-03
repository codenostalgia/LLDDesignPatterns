package com.patterns.behavioral.observerpattern;

import com.patterns.behavioral.observerpattern.observable.TempObservable;
import com.patterns.behavioral.observerpattern.observable.TempObservableImpl;
import com.patterns.behavioral.observerpattern.observors.EmailObserver;
import com.patterns.behavioral.observerpattern.observors.MsgObserver;
import com.patterns.behavioral.observerpattern.observors.TempObserver;

public class ObserverPatternMain {

    public static void main(String[] args) {

        System.out.println("Observer Pattern");

        TempObservable observable = new TempObservableImpl();

        TempObserver obs1 = new MsgObserver(observable);
        TempObserver obs2 = new EmailObserver(observable);

        observable.add(obs1);
        observable.add(obs2);

        observable.setTemp(20);
    }
}
