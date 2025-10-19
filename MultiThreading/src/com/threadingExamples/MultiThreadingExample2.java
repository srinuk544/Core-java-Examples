package com.threadingExamples;

import java.security.DomainCombiner;

public class MultiThreadingExample2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Run method");

		}

	}

	public static void main(String[] args) {
		MultiThreadingExample2 m = new MultiThreadingExample2();
		Thread t = new Thread(m);
		t.start();
		t.run();

		for (int i = 0; i < 3; i++) {
			System.out.println("main method");
		}
	}
}
