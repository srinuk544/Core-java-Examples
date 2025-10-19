import java.util.Iterator;
import java.util.Scanner;

public class FibonacciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter value"); int
		 * in = sc.nextInt();
		 */
		int in = 5;
		int privous = 0;
		int next = 1;
		System.out.println("fibbonics :" + in);
		for (int i = 1; i <= in; i++) {
			System.out.println(privous + "");
			int sum = privous + next;
			privous = next;
			next = sum;

		}
		//sc.close();
	}

}
