package Com.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustom {
    public static void main(String[] args) {
        // Creating a TreeSet with custom Comparator (Descending Order)
        TreeSet<Integer> t = new TreeSet<>(new mytestt());

        t.add(1);
        t.add(3);
        t.add(4);
        t.add(6);
        t.add(5);
        t.add(8);
        t.add(7);
        t.add(2);

        System.out.println("After sorting (Descending Order): " + t);
    }
}

// Custom Comparator to sort in descending order
class mytestt implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      //  return o2.compareTo(o1); // Descending order
        return o1.compareTo(o2);     // Acscending oreder.
    }
}
