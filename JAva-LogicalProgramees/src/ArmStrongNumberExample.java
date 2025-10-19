import java.util.Scanner;

public class ArmStrongNumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int input = sc.nextInt();
		
		int original = input;
		int sum = 0;
		int a = String.valueOf(input).length();
		while (input > 0) {
			int digit = input % 10;
			sum += Math.pow(digit, a);
			input /= 10;

		}
		if (original == sum) {
			System.out.println("armstrong");

		} else {
			System.out.println("not a arm strong");
		}

	}

}
