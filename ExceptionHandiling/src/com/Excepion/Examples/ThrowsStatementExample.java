package com.Excepion.Examples;

public class ThrowsStatementExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThrowsStatementExample ts = new ThrowsStatementExample();
		Thread t = new Thread(ts);
		t.start();
		t.run();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main method");
			Thread.sleep(2500);

		}

	}

}
