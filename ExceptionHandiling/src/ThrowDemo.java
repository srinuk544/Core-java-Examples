
public class ThrowDemo {
	static void checkage(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age must e 18 or above");

		} else {
			System.out.println("valid age:" + age);
		}
	}

	public static void main(String[] args) {

		try {
			checkage(15);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception has been caught:" + e.getMessage());
		}

	}

}
