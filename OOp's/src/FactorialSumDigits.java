import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class FactorialSumDigits {

    public static void main(String[] args)  {
    List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
    list.parallelStream().peek(System.out::print).forEachOrdered(System.out::print);
    	
    }
    }
 

