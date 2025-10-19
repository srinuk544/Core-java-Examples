package com.CustomisedExcepion;

public class VoterDemo {
	public static void checkage(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Below 18 or peoples are not aloowed by casting vote :!!!!!!!!!:");

		}
		System.out.println("Perosn Age is above 18 so his eligible to casting vote :" + age);
	}

	public static void main(String[] args) throws InvalidAgeException {
		/*
		 * try { checkage(25); } catch (Exception e) { // TODO: handle exception
		 * System.out.println("Exception alredy cought :" + e.getMessage()); }
		 */
		checkage(18);
	}

}
