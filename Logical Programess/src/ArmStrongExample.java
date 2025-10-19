
public class ArmStrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 153;
		int sum = 0;
		int original = input;

		int a = String.valueOf(input).length();
		while (input > 0) {
			int digit = input % 10;
			sum += Math.pow(digit, a);
			input /= 10;

		}
		if (original == sum) {
			System.out.println("its a arm");

		} else {
			System.out.println("not arm");
		}

	}

}
