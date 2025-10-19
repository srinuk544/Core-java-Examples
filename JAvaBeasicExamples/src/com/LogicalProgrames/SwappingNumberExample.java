package com.LogicalProgrames;

public class SwappingNumberExample {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
// byusing 3rd variable
		System.out.println("Before swapping:" + a + "----" + b);
		/*
		 * int c = a; a = b; b = c; System.out.println("After swapping :" + a + "---" +
		 * b);
		 */

		// with out using 3rd variable
		/*
		 * System.out.println("---------------"); a = a + b; b = a - b; a = a - b;
		 * 
		 * System.out.println("After swapping :" + a + "---" + b);
		 */

		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping:"+a+"--"+b);
	}

}
