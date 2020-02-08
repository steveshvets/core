package com.ss.designPatterns.behavioral.observer.howtodoitinjava;

import java.util.ArrayList;
import java.util.List;
/*
Subject is an having methods to attach and detach observers.
Notifies the attached Observers!!!
Observable is also know as Subject
 */
public class MsgPublisherObservable {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }
    public void detach(Observer o) {
        observers.remove(o);
    }
    public void notifyUpdate(MessageEvent m) {
        for (Observer o : observers) {
            o.update(m);
        }
    }
}
