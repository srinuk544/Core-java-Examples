package com.threadingExamples;

public class ByImplementingThreadExample  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method ");
		
	}
	public static void main(String[] args) {
		ByImplementingThreadExample t=new ByImplementingThreadExample();
		Thread tt=new Thread(t);
		tt.start();
		
		System.out.println("main method");
	}

}
