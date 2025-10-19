package com.Excepion.Examples;

public class VariousMethidsToPrintAnException {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(10 / 5);
			// e.printStackTrace();

			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}
