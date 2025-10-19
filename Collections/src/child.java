
public class child extends parent {
int x=20;
public static void main(String[] args) {
	parent p=new parent();
	System.out.println(p.x);
	
	child c=new child();
	System.out.println(c.x);
	
	parent pp=new child();
	System.out.println(pp.x);
}

}
