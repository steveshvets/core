package com.ss.javaIntermediateInterviewQuestions.DesignPattern.Singleton;

public class SingleObject {

	// create an object of SingleObject

	private static SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be instantiated

	protected SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
