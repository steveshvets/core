package com.ss.designPatterns.behavioral.observer.improved;


public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void change();

}
