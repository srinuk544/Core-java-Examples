import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(24, 106, "venkat"));
		al.add(new Student(23, 86, "srinu"));
		al.add(new Student(30, 90, "venu"));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		for (Student st : al) {
			System.out.println(st.roll + " " + st.name + " " + st.age);

		}

		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		for (Student aa : al) {
			System.out.println(aa.age + "--" + aa.name + "--" + aa.roll);

		}
	}

}
