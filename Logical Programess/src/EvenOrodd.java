import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i = { 44, 88, 7, 8, 9 };
		List<Integer> ll = Arrays.asList(i);
		/*
		 * for (Integer value : ll) {
		 * 
		 * if (value % 2 == 0) { System.out.println("even numbers:" + value); } else {
		 * System.out.println("odd numbers:" + value); }
		 * 
		 * }
		 */
		Map<Boolean, List<Integer>> oddEvenList = ll.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

	}

}
