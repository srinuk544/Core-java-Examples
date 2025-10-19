package Com.map;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        map.put(15000, "realme");
        map.put(20000, "vivo");
        map.put(25000, "oppo");
        map.put(35000, "google");
        map.put(50000, "Iphone");

        // Find the highest price
        Optional<Integer> maxPrice = map.keySet().stream().min(Integer::compareTo);

        // Print the highest entry
        maxPrice.ifPresent(price -> System.out.println("Highest Price: " + price + ", Brand: " + map.get(price)));
        
        
       Set s1=map.keySet();
       System.out.println(s1);
       
       
       Set s2=map.entrySet();
       System.out.println(s2);
       
       Collection c=map.values();
       System.out.println(c);
       
       
       
       
       for(Map.Entry entery: map.entrySet()) {
    	   System.out.println(entery);
    	   
       }
       
       
       
       for(Integer i:map.keySet()) {
    	   System.out.println(i);
    	   
       }
    }
}
