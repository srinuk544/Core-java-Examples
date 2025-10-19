import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		 Function<String,Integer> f=name->name.length();
		 System.out.println(f.apply("java is high level programming lang"));
		 
		 Function<String , String> ff=name->name.concat("srinu");
		 System.out.println(ff.apply("katta"));
		 
	}

}
