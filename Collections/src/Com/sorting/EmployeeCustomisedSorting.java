package Com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCustomisedSorting {
	String name;
	int id;
	public EmployeeCustomisedSorting(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "EmployeeCustomisedSorting [name=" + name + ", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		EmployeeCustomisedSorting e1=new EmployeeCustomisedSorting("sus", 1);
		EmployeeCustomisedSorting e2=new EmployeeCustomisedSorting("busu", 5);
		EmployeeCustomisedSorting e3=new EmployeeCustomisedSorting("gusu", 3);
		EmployeeCustomisedSorting e4=new EmployeeCustomisedSorting("lasu", 8);
		
		List<EmployeeCustomisedSorting> ll=Arrays.asList(e1,e2,e3,e4);
		Collections.sort(ll, new Mytest());
System.out.println(ll);
		
	}

}



class Mytest implements Comparator<EmployeeCustomisedSorting>{

	@Override
	public int compare(EmployeeCustomisedSorting o1, EmployeeCustomisedSorting o2) {
		// TODO Auto-generated method stub
		//return o1.name.compareTo(o2.name); name sorting
		//return Integer.compare(o1.id, o2.id); //accending orderr low to high
		
		
		return Integer.compare(o2.id, o1.id);  // high to low
	}
	
}
