package com.MultiThreadingExamples;

import java.security.DomainCombiner;

public class ByImplementingRunnableInterfaceExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("child thread or run thread");
			
		}

		
	}
	public static void main(String[] args) {
		ByImplementingRunnableInterfaceExample y=new ByImplementingRunnableInterfaceExample();
		Thread t=new Thread(y);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main or parent thread");
			
		}
	}
	

}
