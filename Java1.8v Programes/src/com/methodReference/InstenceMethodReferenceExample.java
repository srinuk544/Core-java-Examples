package com.methodReference;

public class InstenceMethodReferenceExample {

	public void m1() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		InstenceMethodReferenceExample ii = new InstenceMethodReferenceExample();
		Runnable r = ii::m1;
		Thread t = new Thread(r);
		t.start();
	}

}
