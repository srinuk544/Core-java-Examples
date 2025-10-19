import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class EvenOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[] = { 1, 2, 3, 44, 5, 6, 7, 8, 9, 10, 15, 88 };
		List<Integer> ll = Arrays.asList(i);

		for (Integer value : ll) {
			if (value % 2 == 0) {
				System.out.println(" even:" + value);

			} else {
				System.out.println(" odd numbers:" + value);
			}

		}
	
		
		
	}

}
