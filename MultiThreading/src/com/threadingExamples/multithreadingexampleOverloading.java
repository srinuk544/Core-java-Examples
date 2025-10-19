package com.threadingExamples;

public class multithreadingexampleOverloading  extends Thread{
	
	public void run(int i) {
		System.out.println("int ");
	}
	
	public void run(String s) {
		System.out.println("String ");
	}
	
	public static void main(String[] args) {
		multithreadingexampleOverloading m=new multithreadingexampleOverloading();
		m.start();
		
		
	}
	
}
