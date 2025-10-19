package com.test;

import java.util.Arrays;

public class CheckTwoStringsAnagramExample {

	public static boolean isanagram(String s1, String s2) {

		/*
		 * s1 = s1.replaceAll("//s", " "); s2 = s2.replaceAll("//s", " ");
		 */
		if (s1.length() != s2.length()) {
			return false;

		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

	}

	public static void main(String[] args) {
		System.out.println(isanagram("earth", "heart"));
		System.out.println(isanagram("silent", "listen"));

	}
}
