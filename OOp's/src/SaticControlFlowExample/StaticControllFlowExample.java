package SaticControlFlowExample;

public class StaticControllFlowExample {
	
	
	static {
		System.out.println("hi this is a first block");
	}
	public void dis(){
	System.out.println("===="+i);
}
	
	{
		 System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=20;
		StaticControllFlowExample.methodOne();
		methodOne();
		StaticControllFlowExample ttt=new StaticControllFlowExample();
		ttt.methodOne();
		ttt.dis();
		try {
			System.out.println("is a main method"+k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int methodOne() {
		// TODO Auto-generated method stub
		System.out.println("");
		return 20;
	}
	static int i = 10;
	static int j = methodOne();
	
	static {
		System.out.println("this is a second static block");
	}

}
