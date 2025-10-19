
public class Fibonnac {
	public static void main(String[] args) {
		int num=10;
		int prev=0;
		int next=1;
		System.out.println("input:"+num);
		
		for(int i=1;i<=num;i++) {
			System.out.println(prev+" ");
			int sum=prev+next;
			prev=next;
			next=sum;
			
			
		}
	}

}
