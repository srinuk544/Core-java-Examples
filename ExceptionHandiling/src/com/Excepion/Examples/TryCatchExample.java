package com.Excepion.Examples;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(10 / 2);
		}
	}

}
