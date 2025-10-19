package com.IntrafacesChanges;

public class Car implements Vechile {

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("Car started");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.conditation();
		Vechile.beakdown();
		
		
	}

}
