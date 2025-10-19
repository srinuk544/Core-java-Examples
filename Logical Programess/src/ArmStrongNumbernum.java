
public class ArmStrongNumbernum {
	public static void main(String[] args) {
		int num = 153;
		int original = num;
		int sum = 0;
		int a = String.valueOf(num).length();
		while (num > 0) {
			int digit = num / 10;
			sum += Math.pow(digit, a);
			num /= 10;

		}

		if (original == num) {
			System.out.println("arm");

		} else {
			System.out.println("not a arm");
		}

	}

}
