package com.Synchronized;

public class Thread1 extends Thread {

	Show s;
	String name;

	public Thread1(Show s, String name) {
		this.s = s;
		this.name = name;

	}

	public void run() {
		s.display(name);
	}

	public static void main(String[] args) {
		Show ss = new Show();
		Thread1 t = new Thread1(ss, "srinu");
		Thread1 t1 = new Thread1(ss, "vasu");

		t.start();
		t1.start();

	}
}
