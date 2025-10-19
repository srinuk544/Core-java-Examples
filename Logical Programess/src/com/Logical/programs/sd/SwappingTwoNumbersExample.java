package com.Logical.programs.sd;

public class SwappingTwoNumbersExample {
	public static void main(String[] args) {
		int a=25;
		int b=30;
		
		int x=a;
		a=b;
		b=x;
		//System.out.println(a+"---"+b);
	//-------------------------------------------	
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a+"---"+b);
		
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		
	}

}
