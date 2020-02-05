package com.ss.designPatterns.behavioral.visitor.improved;


public abstract class CarPart {

    void acceptCarPartVisitor(CarPartVisitor visitor){
        visitor.visit(this);
    }

}
