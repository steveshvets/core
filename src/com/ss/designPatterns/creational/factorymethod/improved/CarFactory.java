package com.ss.designPatterns.creational.factorymethod.improved;

public class CarFactory extends TransportFactory{
	Transport create() {
		return new Car();
	}
}
