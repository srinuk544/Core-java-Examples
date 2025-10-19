import java.util.Scanner;

public class FibonacciSeriesExampl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int input = sc.nextInt();
		int priv = 0;
		int next = 1;
		for (int i = 1; i <= input; i++) {
			System.out.println(priv + " ");
			int sum = priv + next;
			priv = next;
			next = sum;

		}
	}

}
 