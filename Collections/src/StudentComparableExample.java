
public class StudentComparableExample  implements Comparable<StudentComparableExample>{
	int roll;
	String name;
	int age;
	StudentComparableExample(int roll,String name,int age){
		this.age=age;
		this.name=name;
		this.roll=roll;
		
		
	}
	@Override
	public int compareTo(StudentComparableExample st) {
		if(age==st.age)  
			return 0;  
			else if(age>st.age)  
			return 1;  
			else  
			return -1;  
			}  
			}  