package com.ss.designPatterns.behavioral.mediator2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public ChatMediator mediator;
    private List<String> receivedMsgs = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void receive(String sender, String message) {
        String s = sender + ": '" + message + "'";
        System.out.println("[" + name + "'s chat session] " + s);
        receivedMsgs.add(s);
    }
    public void say(String message) {
        mediator.broadcast(name, message);
    }
    public void privateMessage(String who, String message) {
        mediator.message(name, who, message);
    }
}
