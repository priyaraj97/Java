
public class ParamaterizedConstructor {
	int empid; 
	String empname;
	int empage;
	ParamaterizedConstructor(int id,String name)
	{
    empid=id;
	empname=name;
	}
	ParamaterizedConstructor(int id,String name,int age)
	{
		empid=id;
		empname=name;
		empage=age;
	}
	
	void display()
	{
		System.out.println("EMPLOYEE ID :"+empid);
		System.out.println("EMPLOYEE NAME :"+empname);
		System.out.println("EMPLOYEE AGE :"+empage);
	}

	    public static void main(String[] args) {
		ParamaterizedConstructor obj1 = new ParamaterizedConstructor(123,"priyadharshini");
		ParamaterizedConstructor obj2 = new ParamaterizedConstructor(124,"priyaraj",23);
		obj1.display();
		System.out.println("\n");
		obj2.display();
		
	}

}
