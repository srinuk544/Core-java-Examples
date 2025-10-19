package Com.List;

import java.util.Iterator;
import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); // Specify type explicitly
        s.push(1);
        s.add(2);
        s.push(1);
        s.add(2);
        s.push(1);
        s.add(2);
        
        System.out.println(s);
        System.out.println(s.pop());  // Removes and prints the top element (2)
        System.out.println(s.peek()); // Prints top element without removing it
        System.out.println(s.push(10)); // Pushes 10 to stack
        System.out.println(s);
        System.out.println(s.search(10)); // Searches for element 10 (returns 1-based index)
        
        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext()) {
            Integer o = itr.next();
            if (o % 2 == 0) {
                System.out.println(o);
            }else {
            	itr.remove();
            }
        }
    }
}
