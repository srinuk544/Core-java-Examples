package com.threadingExamples;

public class MultiThreadExample1 extends Thread {

	public void run() {
		for (int i = 2; i <= 5; i++) {
			System.out.println("run method");

		}
	}

	public static void main(String[] args) {
		MultiThreadExample1 m = new MultiThreadExample1();
		m.start();
	//	m.run();

		for (int i = 0; i < 5; i++) {
			System.out.println("main method");

		}

	}

}
