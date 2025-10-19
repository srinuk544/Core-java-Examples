package com.interview;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		/*
		 * int[] i1 = { 1, 0, 3, 5, 4, 6, 7, 9, 8 }; int[] i2 = { 10, 13, 12, 11, 14,
		 * 16, 15 };
		 * 
		 * int[] merg = Stream.of(i1,
		 * i2).flatMapToInt(Arrays::stream).distinct().sorted().toArray();
		 * 
		 * System.out.println("After merage:" + Arrays.toString(merg));
		 */
		
		

	
	List<Integer> lis=Arrays.asList(10,1,20,3,5,8,9,25);
	
	int maxx=lis.stream().max(Integer::compare).get();
	int minn=lis.stream().min(Integer::compare).get();
	
	
	System.out.println("Max:"+maxx);
		System.out.println("min:"+minn);
	
	


	}
	
}
