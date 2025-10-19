package com.typesofException;

public class StringOutException {

	public static void main(String[] args) {
		String s="java";
		
		try {
			System.out.println(s.charAt(5));
		}catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println("Caught Exception: " + e);
            System.out.println("Valid character at index 3: " + s.charAt(3));
            e.printStackTrace();
		}
	}
}
