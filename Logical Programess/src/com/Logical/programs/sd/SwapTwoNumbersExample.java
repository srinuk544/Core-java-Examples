package com.Logical.programs.sd;

public class SwapTwoNumbersExample {
	public static void main(String[] args) {
		int a = 20;
		int b = 55;
		System.out.println("before swapping:" + a + "----" + b);

		int x = a;
		a = b;
		b = x;
		System.out.println("after swapping:" + a + "----" + b);
		//------------------------
		a = a + b;
		b = a - b;
		a = a - b;
		//------------------------
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("before swapping:" + a + "----" + b);

	}

}
