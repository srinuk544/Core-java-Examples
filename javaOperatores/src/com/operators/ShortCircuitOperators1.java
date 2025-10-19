package com.operators;

public class ShortCircuitOperators1 {
	public static void main(String[] args) {
		int i=10;
		if(++i<10 && (0/i)>10) {
			System.out.println("Hello");
			
		}else {
			System.out.println("Hiii");
		}
		
		
		
		
		int x=5;
				int y=2;
		
				double d=(double)x/y;
				System.out.println(d);
	}

}
