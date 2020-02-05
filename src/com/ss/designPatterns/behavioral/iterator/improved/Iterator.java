package com.ss.designPatterns.behavioral.iterator.improved;


public interface Iterator<T> {

    T getNext();

    boolean isDone();

}
