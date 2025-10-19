package com.Exceptions;

public class StackOverFlowErrorExcptionExample {
	public static void methodone() {
		methodtwo();

	}

	private static void methodtwo() {
		// TODO Auto-generated method stub
		methodone();
	}

	public static void main(String[] args) {
		methodone();

	}
}
