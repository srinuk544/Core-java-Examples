
public class ThrowExample1 {

	public static void main(String[] args) {
		
		int i=15;
		if(i<18) {
			throw new ArithmeticException("NOT eligible to vote that person");
			
		}else {
			System.out.println("yes you can vote");
		}
	}

}
