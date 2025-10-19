package com.Logic.sd2;

public class CountOccurences {
	public static void main(String[] args) {
		String input = "java is a programming lng 123 %";

		System.out.println("Normal length:" + input.length());

		int latters = 0;
		int digits = 0;
		int spaces = 0;
		int others = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				latters++;

			} else if (Character.isDigit(ch)) {
				digits++;

			} else if (Character.isSpace(ch)) {
				spaces++;

			} else {
				others++;
			}

		}
		System.out.println("latters count:" + latters);
		System.out.println("digits count:" + digits);
		System.out.println("count spaces:" + spaces);
		System.out.println("count others :" + others);

	}

}
