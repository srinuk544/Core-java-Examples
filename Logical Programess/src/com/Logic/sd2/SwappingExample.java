package com.Logic.sd2;

public class SwappingExample {

	public static void main(String[] args) {

		int a = 25;
		int b = 10;
		System.out.println("Before Swapping:" + a + "----" + b);
		/*
		 * int x = a; a = b; b = x; System.out.println("After swapping :" + a + "--" +
		 * b);
		 */

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("With out using Third Variable:" + a + "----" + b);
		
		
		

	}
}
