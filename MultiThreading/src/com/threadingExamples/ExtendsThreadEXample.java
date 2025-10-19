package com.threadingExamples;

public class ExtendsThreadEXample extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Chaild thread ");

		}
	}

	public static void main(String[] args) {
		ExtendsThreadEXample r = new ExtendsThreadEXample();
		r.start();
//r.run();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Parent thread ");

		}
	}
}
