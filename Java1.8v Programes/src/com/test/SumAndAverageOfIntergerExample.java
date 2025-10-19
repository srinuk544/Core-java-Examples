package com.test;

import java.util.Arrays;
import java.util.List;

public class SumAndAverageOfIntergerExample {
	
	private static int sumDigits(int num) {
		return String.valueOf(num).chars().map(i -> i - '0').sum();

	}
	public static void main(String[] args) {
		int []i= {1,2,5,11,13};
		//List<int[]> ll=Arrays.asList(i);
		
		int sum=Arrays.stream(i).sum();
		double avarge=Arrays.stream(i).average().orElse(0);
		
		System.out.println("sum of array"+sum);
		
		System.out.println("avarage of array:"+avarge);
	}

}
