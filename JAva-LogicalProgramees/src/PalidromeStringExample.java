import java.util.Scanner;

public class PalidromeStringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");

		String name = sc.nextLine();
		String original = name;
		String rev = " ";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);

		}
		System.out.println("Reverse a String:" + rev);

		if (original.equals(rev)) {
			System.out.println("is a palidrome string");

		} else {
			System.out.println("not a palidrome string");
		}
	}

}
