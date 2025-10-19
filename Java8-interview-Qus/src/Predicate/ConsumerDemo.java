package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(11,22,10,20);
		Consumer<Integer> con=c->System.out.println("Square of number:"+c*c);
		//con.accept(list);
		list.forEach(con);
	}

}
