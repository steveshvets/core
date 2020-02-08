package com.ss.designPatterns.behavioral.observer.howtodoitinjava;

public class MessageSubscriberOne implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
