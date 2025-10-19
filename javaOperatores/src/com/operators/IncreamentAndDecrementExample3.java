package com.operators;

public class IncreamentAndDecrementExample3 {
	public static void main(String[] args) {
		/*
		 * int x = 10; int y = 5; int z = x++ + --y; System.out.println(z);
		 * 
		 * System.out.println(x); System.out.println(y);
		 */
		
		
		int x = 3;
		int y = x++ + ++x + --x + x--;
		System.out.println(y);
		
		
		int a = 5;
		System.out.println(a++ + a-- + --a + ++a);


	}

}
