package com.arrays;

public class VarArgMethodsExample {
	public static void m1(int...i) {
		System.out.println("int arg");
	}
	
public static void main(String[] args) {
	VarArgMethodsExample v=new VarArgMethodsExample();
	v.m1(10);
}
}
