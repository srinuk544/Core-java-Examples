package com.operators;

public class StringConcatenationOperator {
	public static void main(String[] args) {
		String name = "logic";
		name = name + "while";
		System.out.println(name);

		String a = "10";
		String b = "20";
		System.out.println(a + b);
		
		System.out.println("hello"+null);
		
		int aa = 5, bb = 10;
		System.out.println("Sum: " + aa + bb);
		System.out.println("Sum: " + (aa + bb));
		
		String str = "Java";
		int x = 10, y = 20;
		str += x + y;
		System.out.println(str);
		
		System.out.println('A' + 5 + "Java");

		String strr = "Result: " + 5 * 2;
		System.out.println(strr);


	}

}
