package com.threadingExamples;

public class JoinMethodExample implements Runnable {

	@Override
	public void run() {
		System.out.println("run methodd");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethodExample j = new JoinMethodExample();
		Thread t = new Thread(j);
		t.start();
t.join();
		System.out.println("main method");
	}

}
