package com.MultiThreading;

public class ByImmplemingByRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method pls come");

	}

	public static void main(String[] args) {
		ByImmplemingByRunnable by = new ByImmplemingByRunnable();
		Thread t = new Thread(by);

		t.start();
		System.out.println("main");
	}

}
