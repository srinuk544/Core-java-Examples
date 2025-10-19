package com.Exceptions;

public class CustomisedExaceptionsExample {
	public static void main(String[] args) {
		// System.out.println(10/0);
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			
			System.out.println(10/5);
			//e.printStackTrace();
		}
	}

}
