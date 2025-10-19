package com.instencecontrollflow;

public class parent {
	int i = 25;
	{
		m1();
		System.out.println(" parent 1st instence");
	}

	public parent() {
		System.out.println(" parent construcotr");
	}

	public static void main(String[] args) {

		parent p = new parent();
		System.out.println("main methodd");

	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}

	{
		System.out.println("parent 2nd instent block ");
	}
	int j = 55;

}