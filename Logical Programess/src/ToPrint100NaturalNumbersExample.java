
public class ToPrint100NaturalNumbersExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				System.out.println("even numbers");
				System.out.println(i);

			} else {
				System.out.println();
				System.out.println(i);
			}
		}

		System.out.println("---------------------");
		int i = 1;
		while (i <= 50) {
			System.out.println(i);
			i++;
		}

		System.out.println("-------------------");

		int ii = 1; // Initialization

		do {
			System.out.println(i);
			ii++; // Increment
		} while (ii <= 100); // Condition
	}

}
