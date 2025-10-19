package com.MultiThreading;

import java.security.DomainCombiner;

public class JoinMethod implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("this is a run method thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethod j = new JoinMethod();
		Thread t = new Thread(j);
		t.start();
		t.join();
		for (int i = 0; i < 4; i++) {
			System.out.println("main method thread");
			/*
			 * try { Thread.sleep(3500); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}

}
