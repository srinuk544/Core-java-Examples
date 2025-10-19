package com.Excepion.Examples;

public class DefaultExceptionHadilingExample {
	public static void main(String[] args) {
		dostuff();

	}

	private static void dostuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println(10 / 0);
	}

}
