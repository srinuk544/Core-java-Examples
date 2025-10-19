package com.arrays;

public class CountEachTypeOfCharcter {

	public static void main(String[] args) {
		String s = "  1 java is a programming lang";

		System.out.println(s.length());

		int letters = 0;
		int digits = 0;
		int space = 0;
		int others = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				letters++;

			} else if (Character.isDigit(ch)) {
				digits++;

			} else if (Character.isSpace(ch)) {
				space++;

			} else {
				others++;
			}

		}

		System.out.println("Letters:" + letters);
		System.out.println("Digit:" + digits);
		System.out.println("spaces:" + space);
		System.out.println("others:" + others);

	}
}
