package com.Logical.programs.sd;

public class CountEachTypeofCharacter {
	public static void main(String[] args) {

		String s = "java, is  a programming lang 123";
		System.out.println("Normal length :" + s.length());

		int latters = 0;
		int digits = 0;
		int spaces = 0;
		int others = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
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
		System.out.println("latters :" + latters);
		System.out.println("digits :" + digits);
		System.out.println("spaces :" + spaces);
		System.out.println("others :" + others);

	}

}
