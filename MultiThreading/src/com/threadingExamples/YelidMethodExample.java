package com.threadingExamples;

public class YelidMethodExample  extends Thread{
	
	
	public void run() {
		Thread.yield();
		System.out.println("run method");
		
	}
	
	public static void main(String[] args) {
		 YelidMethodExample t=new YelidMethodExample();
		 t.start();
		 
		 System.out.println("main method");
	}

}
