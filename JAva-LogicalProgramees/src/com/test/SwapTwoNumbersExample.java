package com.test;

public class SwapTwoNumbersExample {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		System.out.println("Before swapping" + a + "-----" + b);

		int x = a;
		a = b;
		b = x;
		System.out.println("After swapping :" + a + "----" + b);

		int y = 55;
		int o = 20;

		System.out.println("Before swapping" + y + "-----" + o);

		y = y + o;
		o = y - o;
		y = y - o;

		System.out.println("After swapping :" + y + "----" + o);

		int p = 100;
		int q = 200;
		int z = 300;

		System.out.println("Before swapping :" + p + "----" + q + "----" + z);

		p = p + q + z;
		q = p - (q + z);
		z = p - (q + z);
		p = p - (q + z);

		System.out.println("After swapping :" + p + "----" + q + "----" + z);

	}

}
