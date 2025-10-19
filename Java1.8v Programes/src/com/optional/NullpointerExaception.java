package com.optional;

public class NullpointerExaception {

	public static void main(String[] args) {
		String s = null;
		//System.out.println(s.lastIndexOf(0));

		if (s != null) {
			System.out.println("not a null");

		} else {
			System.out.println("is a  null");
		}
	}

}
