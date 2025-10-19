
public class ArmStrongNumberExamplee {
	public static void main(String[] args) {
		int input = 153;
		int original = input;
		int sum = 0;
		int a = String.valueOf(input).length();
		while (input > 0) {
			int digit = input % 10;
			sum += Math.pow(digit, a);
			input /= 10;

		}
		if (original == sum) {
			System.out.println("arm strong ");

		} else {
			System.out.println("not arm strong");
		}
	}

}
