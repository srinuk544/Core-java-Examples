package com.methodReference;

@FunctionalInterface
interface MyInterface {
	void myMethod();
}

public class StaticMethodReferenceExample1 {

	public static void m1() {
		System.out.println("is a static method");

	}

	public void m2() {
		System.out.println("this ia instence method");
	}

	public static void main(String[] args) {
		MyInterface m = StaticMethodReferenceExample1::m1;
		m.myMethod();

		StaticMethodReferenceExample1 s = new StaticMethodReferenceExample1();
		Runnable r = s::m2;
		Thread t = new Thread(r);
		t.start();

	}

}
