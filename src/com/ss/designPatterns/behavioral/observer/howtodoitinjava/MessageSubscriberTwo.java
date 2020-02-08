package com.ss.designPatterns.behavioral.observer.howtodoitinjava;

public class MessageSubscriberTwo implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
