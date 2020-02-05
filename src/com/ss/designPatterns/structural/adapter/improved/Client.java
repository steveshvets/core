package com.ss.designPatterns.structural.adapter.improved;

//We would like to invoke legacy rectangle 
//But we are having a calculateRectangleSize method that is using new Rectangle 
//GOAL: new rectanlge code work with legacy rectangle
public class Client {
	public static void main(String [] args){
		Client client = new Client();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);
        client.calculateRectangleSize(adapter);		
	}	
	public void calculateRectangleSize(Rectangle rectangle){
		System.out.println("Rectangle Size: "+rectangle.determineSize());
	}	
}

