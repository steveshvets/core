package com.ss.designPatterns.behavioral.observer.howtodoitinjava;
/*
Any object that wishes to be notified when object changes.
 */
public interface Observer {
    public void update(MessageEvent m);
}
