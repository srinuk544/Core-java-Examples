package com.Exceptions;

public class variousMothdsToPrintExceptions {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
