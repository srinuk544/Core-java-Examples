package Com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentByComparableExample implements Comparable<StudentByComparableExample> {

	String name;
	int id;

	public StudentByComparableExample(String name, int id) {

		this.name = name;
		this.id = id;

	}
@Override
	  public int compareTo(StudentByComparableExample s) {
	        return this.id - s.id;
	    }

	public void show() {
		System.out.println("name of the student:" + name + "----" + "id of the student :" + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentByComparableExample> ll = new ArrayList<>();
		ll.add(new StudentByComparableExample("Srinu", 1));
		ll.add(new StudentByComparableExample("Vasu", 2));
		ll.add(new StudentByComparableExample("sorry", 3));
		ll.add(new StudentByComparableExample("vamsi", 4));
		ll.add(new StudentByComparableExample("hari", 5));

		Collections.sort(ll);
		for (StudentByComparableExample studentByComparableExample : ll) {
			System.out.println(studentByComparableExample);
		}

	}
}
