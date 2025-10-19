package com.synchronization;

public class MyThread extends Thread {
	Display d;
	String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
	}

	public static void main(String[] args) {
		Display d = new Display();
		MyThread m = new MyThread(d, "srinu");
		MyThread m1 = new MyThread(d, "katta");
		m.start();
		m1.start();
	}
}
