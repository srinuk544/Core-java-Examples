import java.util.Scanner;

public class FibonacciSeriesExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int input = sc.nextInt();
		int previous = 0;
		int next = 1;

		System.out.println("numberr:" + input);
		for (int i = 1; i <= input; i++) {
			System.out.println(previous + " ");
			int sum = previous + next;
			previous = next;
			next = sum;

		}

	}

}
