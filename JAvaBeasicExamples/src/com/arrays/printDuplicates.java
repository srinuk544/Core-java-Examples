package com.arrays;

import java.util.Arrays;

public class printDuplicates {
	public static void main(String[] args) {
		String str="srinivas ";
		int count=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("dupilicate chars :"+ch[j]);
					count++;
					
				}
				
				
			}
			
		}
		System.out.println("count of the char:"+count);
	}

}
