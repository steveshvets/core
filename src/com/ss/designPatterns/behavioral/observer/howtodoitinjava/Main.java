package com.ss.designPatterns.behavioral.observer.howtodoitinjava;

public class Main {
    public static void main(String[] args) {
        MsgObserverOne s1 = new MsgObserverOne();
        MsgObserverTwo s2 = new MsgObserverTwo();
        MsgObserverThree s3 = new MsgObserverThree();

        MsgPublisherObservable p = new MsgPublisherObservable();
        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new MessageEvent("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new MessageEvent("Second Message")); //s2 and s3 will receive the update
    }
}
