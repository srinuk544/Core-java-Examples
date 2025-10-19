import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOrOddNumber {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 5, 4, 8, 99, 10 };
		List<Integer> numberList = Arrays.asList(a);

		for (Integer value : numberList) {
			//System.out.println(value);
			if (value % 2 == 0) {
				//System.out.println("is even:" + value);

			} else {
				//System.out.println("is a odd:" + value);
			}
		}

Map<Boolean, List<Integer>>	oddEvenList	=numberList.stream().collect(Collectors.partitioningBy(num->num%2==0));
		
Set<Map.Entry<Boolean, List<Integer>>> entrySet=oddEvenList.entrySet();
for(Map.Entry<Boolean, List<Integer>> entyObject:entrySet) {
	//System.out.println("=========");
	if(entyObject.getKey()) {
	//	System.out.println("even numbers::::");
		for(Integer value:entyObject.getValue()) {
		//	System.out.println(value);
		}
		
	}else {
		//System.out.println("Odd numbers::::");
		for(Integer value:entyObject.getValue()) {
		//	System.out.println(value);
		}
	}
}
oddEvenList.forEach((key,value)-> {
	if(key) {
		System.out.println(value);
		System.out.println("=======");
	}else {
		System.out.println(value);
	}
});

	}

}
