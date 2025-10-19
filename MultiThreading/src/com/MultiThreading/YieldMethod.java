package com.MultiThreading;

import java.security.DomainCombiner;

public class YieldMethod implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			//Thread.yield();
			System.out.println("run method ");

		}

	}

	public static void main(String[] args) {
		YieldMethod y = new YieldMethod();
		Thread t = new Thread(y);

		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main  method ");

		}
	}
}
