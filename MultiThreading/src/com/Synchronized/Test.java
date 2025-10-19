package com.Synchronized;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display dd = new Display();
		MyThread m = new MyThread(dd, "srinu");
		MyThread mm = new MyThread(dd, "battu");
		mm.start();
		m.start();
	}

}
