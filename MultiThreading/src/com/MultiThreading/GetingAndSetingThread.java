package com.MultiThreading;

public class GetingAndSetingThread  implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("override run method");	
	}
	public static void main(String[] args) {
		GetingAndSetingThread gt=new GetingAndSetingThread();
		Thread t=new Thread(gt);
		t.start();
		
		t.setName("srinu");
		System.out.println(t.getName());
		
		System.out.println("main");
		
		
	}

	

}
