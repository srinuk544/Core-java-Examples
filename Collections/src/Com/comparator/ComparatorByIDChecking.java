package Com.comparator;

import java.util.Comparator;

public class ComparatorByIDChecking implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}
