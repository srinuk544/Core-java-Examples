package com.instencecontrollflow;

public class InstenceControlFlow {
	int i = 10;
	{
		m1();
		System.out.println("first instence block");
	}

	public InstenceControlFlow() {
		System.out.println("constractorr");
	}

	public static void main(String[] args) {
		InstenceControlFlow cc=new InstenceControlFlow();
		System.out.println("main method");

	}

	private void m1() {

		// TODO Auto-generated method stub

		System.out.println(j);
	}

	{
		System.out.println("second instence block");
	}
	int j = 200;
}
