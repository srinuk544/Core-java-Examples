package com.FunctionalIntraface;

interface Intraface2 {
	public void m1();

	public default void add(int a, int b) {
		System.out.println(a + b);

	}

}

public class WithoutlambdaExample implements Intraface2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 methodd");

	}

	public static void main(String[] args) {
		WithoutlambdaExample w = new WithoutlambdaExample();
		w.m1();
		w.add(10, 28);
	}

}
