import java.util.Scanner;

public class PalidromeNumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int input = sc.nextInt();
		int original = input;
		int rev = 0;
		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;

		}
		System.out.println("after reverse:" + rev);

		if (original == rev) {
			System.out.println("palidrome");

		} else {
			System.out.println("not a palidrome");
		}
	}

}
