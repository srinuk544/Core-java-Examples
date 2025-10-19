package com.operators;

interface Vehicle {
}

class Car implements Vehicle {
}

public class InterfaceInstanceof {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c instanceof Vehicle); 
	}
}
