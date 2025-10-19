package com.test;

public class SwappingTwoIntegersExample {
	public static void main(String[] args) {

		String a = "srinu";
		String b = "yadav";

		System.out.println("Before swapping :" + a + "---------" + b);

		String c = a;
		a = b;
		b = c;

		System.out.println("After swapping :" + a + "---------" + b);
	}

}
