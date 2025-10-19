package com.test2.intermidiateoperations;
public class Add1 {
//static w.r.to Interface1
	public static int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {

		System.out.println("*******");

		Interface1 inf = Add1::add;
		System.out.println(inf.sum(10, 20));

		
	
}}