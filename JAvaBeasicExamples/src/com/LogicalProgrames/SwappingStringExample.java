package com.LogicalProgrames;

public class SwappingStringExample {
	public static void main(String[] args) {
		String a = "java";
		String b = "python";
		System.out.println("Before swapping:" + a + "---" + b);

		String c = a;
		a = b;
		b = c;
		System.out.println("After swapping:" + a + "---" + b);

	}

}
