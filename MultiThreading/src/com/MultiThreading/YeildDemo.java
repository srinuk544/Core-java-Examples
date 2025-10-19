package com.MultiThreading;

public class YeildDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			
			System.out.println("-------run method------");
		}

	}

	public static void main(String[] args) {
		YeildDemo y = new YeildDemo();
		Thread t = new Thread(y);
		t.start();
		Thread.yield();
		for (int i = 0; i < 2; i++) {
			
			System.out.println("-------main method------");
		}
	}

}
