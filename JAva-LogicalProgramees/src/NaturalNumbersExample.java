import java.util.Scanner;

public class NaturalNumbersExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; ++i) {
			sum = sum + i;

		}
		System.out.println("Sum of  natural numbers:" + sum);

		/*
		 * int num, i, sum = 0; // object of Scanner class Scanner sc = new
		 * Scanner(System.in); System.out.print("Sum from: ");
		 * 
		 * i = sc.nextInt(); System.out.print("Sum up to: ");
		 * 
		 * num = sc.nextInt(); while (i <= num) {
		 * 
		 * sum = sum + i;
		 * 
		 * i++; }
		 * 
		 * System.out.println("Sum of Natural Numbers = " + sum);
		 */
	}
}