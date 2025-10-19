
public class Fibonnacciseries {
	public static void main(String[] args) {

		int num = 5;
		int prev = 0;
		int next = 1;
		System.out.println("numberr:" + num);
		for (int i = 1; i <= num; i++) {
			System.out.println(prev + " ");
			int sum = prev + next;
			prev = next;
			next = sum;

		}

	}

}
