import java.util.Scanner;

public class FibonacciProgramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr");
		int input = sc.nextInt();
		int privous = 0;
		int next = 1;
		System.out.println("fibonacci:" + input + "number");

		for (int i = 1; i <= input; i++) {
			System.out.println(privous + "");
			int sum = privous + next;
			privous = next;
			next = sum;

		}
		sc.close();
	}

}
