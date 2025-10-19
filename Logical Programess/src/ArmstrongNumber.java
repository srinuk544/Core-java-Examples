
public class ArmstrongNumber {
	public static void main(String[] args) {
		int input = 153;
		int sum = 0;
		int original = input;
		int a = String.valueOf(input).length();
		// System.out.println(a);

		while (input > 0) {
			int digit = input % 10;
			sum += Math.pow(digit, a);

			input /= 10;

		}
		if (original == sum) {
			System.out.println("okk");

		} else {
			System.out.println("not ok");
		}
	}
}
