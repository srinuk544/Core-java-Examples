package com.synchronization;

public class Display {
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("Goood Morning:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
	}

}
