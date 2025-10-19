package com.threadingExamples;

import java.util.Iterator;

public class YieldMethodExample extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			//Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run method ");
		}
	}

	public static void main(String[] args) {
		YieldMethodExample y = new YieldMethodExample();
		y.start();
		y.setPriority(10);
		y.getPriority();
		for (int k = 0; k <= 6; k++) {
			System.out.println("main mrthod");

		}
	}
}
