package com.MultiThreadingExamples;

public class ByExtandingThreadExample  extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Run thread");
			
		}
	}
	public static void main(String[] args) {
		ByExtandingThreadExample n=new ByExtandingThreadExample();
		n.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("main thread");
			
		}
	}

}
