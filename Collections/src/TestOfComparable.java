import java.util.ArrayList;
import java.util.Collections;

public class TestOfComparable {
	public static void main(String[] args) {
		ArrayList<StudentComparableExample> al = new ArrayList<StudentComparableExample>();
		al.add(new StudentComparableExample(101, "Vijay", 23));
		al.add(new StudentComparableExample(106, "Ajay", 27));
		al.add(new StudentComparableExample(105, "Jai", 21));
		Collections.sort(al);
		for (StudentComparableExample st : al) {
			System.out.println(st.roll + " " + st.name + " " + st.age);
		}
	}
}