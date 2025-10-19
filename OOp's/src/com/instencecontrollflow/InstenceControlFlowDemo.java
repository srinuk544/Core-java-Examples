package com.instencecontrollflow;

public class InstenceControlFlowDemo {
	int i = 30;
	{
		M1();
		System.out.println("first instence block");
	}

	InstenceControlFlowDemo() {
		System.out.println("constractor");
	}

	public static void main(String[] args) {
		InstenceControlFlowDemo m = new InstenceControlFlowDemo();
		System.out.println("main method");
	}

	public void M1() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}

	{
		System.out.println("second instence block");
	}
	int j = 50;

}
