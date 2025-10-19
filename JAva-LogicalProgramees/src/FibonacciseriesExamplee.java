
public class FibonacciseriesExamplee {

	public static void main(String[] args) {
		 int num=4;
		 int prev=0;
		 int next=1;
		 for(int i=1;i<=num;i++) {
			 System.out.println(prev+ " ");
			 int sum=prev+next;
			 prev=next;
			 next=sum;
			 
			 
		 }
	}
}
