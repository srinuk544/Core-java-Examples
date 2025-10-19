package com.test;

import java.io.FileNotFoundException;

import javax.print.attribute.standard.MediaSize.Other;

public class CountAllDigitsExample {
	public static void main(String[] args) {
		String s = "java is platform independent lang 125";
		int digit = 0;
		int space = 0;
		int latters = 0;
		int orther = 0;

		for (int i = 0; i < s.length(); i++) {
			char chr = s.charAt(i);
			if (Character.isLetter(chr)) {
				latters++;

			} else if (Character.isDigit(chr)) {
				digit++;

			} else if (Character.isSpace(chr)) {
				space++;

			} else {
				orther++;

			}
			System.out.println("Digits :" + digit);
			System.out.println("Latters ]:" + latters);
			System.out.println("space  :" + space);
			System.out.println("others :" + orther);

		}
	}

}
