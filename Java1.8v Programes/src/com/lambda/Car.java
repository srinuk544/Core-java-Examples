package com.lambda;

public class Car implements Vechile {

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("car started ");
	}

	public static void main(String[] args) {
		/*
		 * Car c=new Car(); c.start();
		 */

		Vechile vc = () -> System.out.println("car ");
		vc.start();
	}
}
