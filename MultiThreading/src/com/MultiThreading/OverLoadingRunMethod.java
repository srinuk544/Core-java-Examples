package com.MultiThreading;

public class OverLoadingRunMethod extends Thread {
	public void run() {
		System.out.println("no arg method");
	}

	public void run(int i) {
		System.out.println("int arg method");

	}

	public static void main(String[] args) {
		OverLoadingRunMethod o = new OverLoadingRunMethod();
		Thread t = new Thread(o);

		t.start();
		System.out.println("main methodd");

	}

}
