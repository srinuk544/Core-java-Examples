package com.Synchronized;

public class Show {

	public synchronized void display(String name) {

		for (int i = 0; i < 3; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}

}
