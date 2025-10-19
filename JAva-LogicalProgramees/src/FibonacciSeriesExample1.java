
public class FibonacciSeriesExample1 {
	public static void main(String[] args) {
		int input = 10;
		int privous = 0;
		int next = 1;
		for (int i = 1; i <= input; i++) {
			System.out.println(privous + " ");
			int sum = privous + next;
			privous = next;
			next = sum;
			//System.out.println(sum);

		}
	}

}
