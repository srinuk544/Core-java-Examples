import java.util.Scanner;

public class CountEvenAndOddNumbersEXample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("inpiut");

		int num = sc.nextInt();
		int even = 0;
		int odd = 0;

		while (num > 0) {
			int sum = num % 10;
			if (sum % 2 == 0) {
				even++;

			} else {
				odd++;
			}
			num = num / 10;

		}
		System.out.println("even numbers count:" + even);
		System.out.println("odd numbers count:" + odd);
	}

}
