package Com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
       
        ArrayList<MyClass> al = new ArrayList<>();

        
        al.add(new MyClass(1, "Java"));
        al.add(new MyClass(3, "Python"));
        al.add(new MyClass(4, "DevOps"));
        al.add(new MyClass(2, ".Net"));
        al.add(new MyClass(5, "DSA"));

        System.out.println("Before Sorting: " + al);

       
        Collections.sort(al, new MyComparator());
        System.out.println("After Sorting: " + al);
    }
}

class MyClass {
    int id;
    String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}


class MyComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return Integer.compare(o1.id, o2.id); // Ascending order
      //  return Integer.compare(o2.id, o1.id); // Descending order
    }
}
