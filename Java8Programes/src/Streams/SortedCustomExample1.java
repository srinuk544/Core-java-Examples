package Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class SortedCustomExample1 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("srinu", "veu", "hari", "venkat");
	l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(i -> System.out.println(i));
	}}
