package com.ss.designPatterns.behavioral.observer.howtodoitinjava;
/*
Any object that wishes to be notified when object changes.
 */
public class MsgObserverTwo implements Observer{
    @Override
    public void update(MessageEvent m) {
        System.out.println("MessageObserverTwo :: " + m.getMessageContent());
    }
}
