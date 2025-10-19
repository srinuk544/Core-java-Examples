package com.Logical.programs.sd;

public class SwapTwoStrinsExample {
	public static void main(String[] args) {
		String a = "srinu";
		String b = "katta";

		System.out.println("Before swaping:" + a + "------" + b);

		String x = a ;
		a = b;
		b = x;
		System.out.println("after swaping:" + a + "------" + b);
	}

}
