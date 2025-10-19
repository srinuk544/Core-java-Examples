public class FinalizeExample {
	int id;

	FinalizeExample(int id) {
		this.id = id;
	}

	

	protected void finalize() {
		System.out.println("ikkkk:" + id);
	}
	

	public static void main(String[] args) {
		FinalizeExample obj1 = new FinalizeExample(1);
		FinalizeExample obj2 = new FinalizeExample(2);

		/*
		 * obj1 = ; // Eligible for GC obj2 = null; // Eligible for GC
		 */
		
		String s=new String();
		System.out.println(s.toString());
		
		
		//System.out.println(s.hashCode());
		// Suggest JVM to run Garbage Collector
		System.gc();

		System.out.println("Main method ends");
	}
}
