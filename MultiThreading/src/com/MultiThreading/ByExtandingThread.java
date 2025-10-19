package com.MultiThreading;

import java.util.Iterator;

public class ByExtandingThread  extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("child run");
		}
	}
	public static void main(String[] args) {
		ByExtandingThread v=new ByExtandingThread();
		Thread t=new Thread(v);
		t.start();
		//t.run();
		for(int i=0;i<8;i++) {
			System.out.println("main");
			
		}
		
	}

}
