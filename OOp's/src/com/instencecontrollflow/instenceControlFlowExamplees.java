package com.instencecontrollflow;

public class instenceControlFlowExamplees {
	int i = 10;
	{
		m1();
		System.out.println("1st instence block");
	}

	instenceControlFlowExamplees() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instenceControlFlowExamplees i = new instenceControlFlowExamplees();
		System.out.println("main method ");
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}

	{
		System.out.println("2nd instence block");
	}
	int j = 30;

}
