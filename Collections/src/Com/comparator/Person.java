package Com.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person {

	int id;
	String name;
	String mail;
	String addrs;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mail=" + mail + ", addrs=" + addrs + "]";
	}

	public Person(int id, String name, String mail, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.addrs = addrs;

	}

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person(4, "sunny", "s@gmail.com", "pdpl"),
				new Person(3, "hari", "h@gmail.com", "chkl"), new Person(9, "triveni", "t@gmail.com", "gntr"),
				new Person(2, "rupa", "r@gmail.com", "cdpl"), new Person(4, "munny", "m@gmail.com", "bdpl"));

		Collections.sort(person, new ComparatorByIDChecking());
		for (Person person2 : person) {
			System.out.println(person2);

		}

	}

}
