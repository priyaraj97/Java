package Task;
import java.util.*;
public class customer
{
	ArrayList<String> customerlist = new ArrayList<String>(); 
    Scanner sc = new Scanner(System.in);
    public void addcustomer() 
    {
    System.out.println("Enter Customer Name");
    
    int i;
    for(i=0;i<5;i++)
    {
    	String customer = sc.nextLine();
        customerlist.add(customer);
   }
    System.out.println("Entered customerlist Succesfully");
    System.out.println("Original ArrayList:");
    for(String str:customerlist)
    System.out.println(str);
    }
    	    
	public void removenumber()
	{
		System.out.println("Enter Customer Name to be Remove");
	    String customer = sc.nextLine();
	    customerlist.remove(customer);
	    
	System.out.println("Removed : " +customer +" Succesfully");
    System.out.println("Original ArrayList:");
    for(String str1:customerlist)
    System.out.println(str1);
}
    public static void main(String[] args)
   {
	      customer a=new customer();
	      customer a1=new customer();
          a.addcustomer();
          a1.removenumber();    
   }
}

