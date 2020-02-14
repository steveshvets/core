package com.ss.designPatterns.structural.decorator2;

public class CarDecorator implements Car {
    protected Car car;
    public CarDecorator(Car c){
        this.car=c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
