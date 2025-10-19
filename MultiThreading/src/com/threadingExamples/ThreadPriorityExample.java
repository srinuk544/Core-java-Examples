package com.threadingExamples;

public class ThreadPriorityExample implements Runnable {

	@Override
	public void run() {
		System.out.println("run method");
		
	}
	
	public static void main(String[] args) {
		ThreadPriorityExample t=new ThreadPriorityExample();
		Thread tt=new Thread(t);
		tt.start();
		tt.setPriority(100);
		System.out.println("main method");
		
	}
	

}
