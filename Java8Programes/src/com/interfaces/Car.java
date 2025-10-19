package com.interfaces;

public class Car implements Vechile{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car move both forword and backword");

	}
	
	public static void main(String[] args) {
		Car c =new Car();
		c.move();
		c.speed();
		Vechile.range();
	}

	

}
