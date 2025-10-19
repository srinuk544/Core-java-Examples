package Com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Emp implements Comparable<Emp> {
	String name;
	int id;

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;

	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Emp other) {
		return Integer.compare(other.id, this.id);
	}

	public static void main(String[] args) {
		Emp e1 = new Emp("jon", 10);
		Emp e2 = new Emp("sus", 30);
		Emp e3 = new Emp("busu", 50);
		Emp e4 = new Emp("chichu", 20);

		List<Emp> ll = Arrays.asList(e1, e2, e3, e4);
		Collections.sort(ll);
		System.out.println(ll);

		TreeSet<Emp> t = new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println("TreeSett:" + t);

		TreeSet<Emp> t1 = new TreeSet<>(new mywork());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		//Collections.sort(t1);
		System.out.println("By using tree set sorting:" + t1);

	}
}

class mywork implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}