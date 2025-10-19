import java.util.Arrays;
import java.util.List;

public class EvenNotOdd {

	public static void main(String[] args) {
		Integer i[] = { 44, 87, 77, 20, 52 };
		List<Integer> ii = Arrays.asList(i);

		for (Integer value : ii) {
			if (value % 2 == 0) {
				System.out.println("even:" + value);

			} else {
				System.out.println("odd:" + value);
			}

		}

	}
}
