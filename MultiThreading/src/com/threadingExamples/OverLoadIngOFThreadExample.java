package com.threadingExamples;

public class OverLoadIngOFThreadExample extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("no arg method");

		}
	}

	public void run(int i) {
		for (int k = 1; k < 4; k++) {
			System.out.println("int arg method ");

		}

	}

	public static void main(String[] args) {
		OverLoadIngOFThreadExample o = new OverLoadIngOFThreadExample();
		o.start();
		o.run(10);
		for (int j = 0; j < 5; j++) {
			System.out.println("main thread ");

		}
	}

}
