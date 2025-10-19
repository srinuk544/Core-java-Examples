package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccuernece {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String s = sc.nextLine();
		s.replace(" " ,"");
		char[] ch = s.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			map.put(ch[i], count);
		}
		System.out.println(map);
	}
}
