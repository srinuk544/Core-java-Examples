package com.arrays;

public class Palidrome {
	
	public static void main(String[] args) {
		int i=131;
		int original=i;
		int rev=0;
		while(i!=0) {
			rev=rev*10+original%10;
			original =original/10;
			
			
				}
		
		if(original==rev) {
			System.out.println("palidrome");
			
		}else {
			System.out.println("not yet");
		}
	}

}
