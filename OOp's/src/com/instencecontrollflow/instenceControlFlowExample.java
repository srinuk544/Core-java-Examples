package com.instencecontrollflow;

public class instenceControlFlowExample {
	int i = 10;
	{
		m1();
		System.out.println("1st instence block");

	}

	public instenceControlFlowExample() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		instenceControlFlowExample i = new instenceControlFlowExample();
		System.out.println("main method");

	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(j);

	}

	{
		System.out.println("2nd instence block");
	}

	int j = 25;

}
