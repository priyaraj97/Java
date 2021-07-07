
public class Statickeyword 
{
	static
	{
	System.out.println("static block invoked");
}
	
	int empid; 
	String empname;
	int empage;
	static String companyname="Infovision pvt Ltd.";
	
	 static void change()
	{
		companyname="Thiagarajar collage of engineering";
	
	}
	Statickeyword(int id,String name,int age)
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
		System.out.println("COMPANY NAME :"+companyname);	
	}
      
       public static void main(String[] args) 
      	    {
	    	 Statickeyword.change();
      	    
		Statickeyword obj1 = new Statickeyword(123,"priyadharshini",22);
		Statickeyword obj2 = new Statickeyword(124,"priyaraj",23);
		obj1.display();
		System.out.println("\n");
		obj2.display();
		
	}

}
