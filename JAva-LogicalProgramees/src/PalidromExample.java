import java.util.Scanner;

public class PalidromExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int input = sc.nextInt();
		int original_num = input;
		int rev = 0;
		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;

		}

		if (original_num == rev) {

			System.out.println("is a palidrome number");
		} else {
			System.out.println("not a palidrome number");
		}

	}

}
