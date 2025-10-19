package com.instencecontrollflow;

public class child extends parent {
	int k = 25;
	{
		m2();
		System.out.println("child 1st instencee block");
	}

	child() {
		System.out.println("child constrcotrr");
	}

	public static void main(String[] args) {
		child c = new child();
		System.out.println("main method");
	}

	private void m2() {
		// TODO Auto-generated method stub

		System.out.println(l);

	}

	{
		System.out.println("child 2nd instence block");
	}
	int l = 88;
}
