package arrayandlist;
import java.util.*;
public class Arraylist 
{
		   public static void main(String args[]) 
	   {
	       ArrayList<Integer> obj = new ArrayList<Integer>();
    
	      obj.add(34);
	      obj.add(56);
	      obj.add(78);
	      obj.add(89);
	      obj.add(12);
	      
	      System.out.println("Original ArrayList:");
	      for(Integer str:obj)
          System.out.println(str);

	      
	      obj.add(5, 65);
	      obj.add(6, 23);

	      System.out.println("ArrayList after add operation:");
	      for(Integer str:obj)
	      System.out.println(str);

	      
	      obj.remove(4); 
	      obj.remove(3); 

	      System.out.println("ArrayList after remove operation:");
	      for(Integer str:obj)
	         System.out.println(str);
	          

	      System.out.println("Final ArrayList:");
	      for(Integer str:obj)
	         System.out.println(str);
	   }
	}



