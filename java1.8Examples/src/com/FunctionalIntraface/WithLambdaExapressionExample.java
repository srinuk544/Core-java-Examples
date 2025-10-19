package com.FunctionalIntraface;

@FunctionalInterface
interface myintrafe {
	public void m1();

	public static void add(int i, int j) {
		System.out.println(i * j);

	}
}

public class WithLambdaExapressionExample {

	public static void main(String[] args) {
		myintrafe mm = () -> System.out.println("hiii this a m1 methodd");
		mm.m1();
		myintrafe.add(10, 8);
	}

}
