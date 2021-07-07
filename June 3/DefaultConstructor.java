
public class DefaultConstructor {
	int empid=1; 
	String empname="priyadharshini"; 
	
	void display()
	{
		System.out.println("EMPLOYEE ID :"+empid);
		System.out.println("EMPLOYEE NAME :"+empname);
	}

	public static void main(String[] args) {
		DefaultConstructor obj1 = new DefaultConstructor();
		obj1.display();
		
	}

}
