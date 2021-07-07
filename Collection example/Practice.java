package Task;
import java.util.*;
public class Practice
{
	
	
    public static void main(String[] args)
   {
    	ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the 5 numbers: ");
        int i,j; 
        for(i=0;i<5;i++)
        {
         j=sc.nextInt();
       numbers.add(j);
   }
    	System.out.println("Entered 5 numbers Succesfully");

      
      System.out.println("Original ArrayList:");
      for(Integer str:numbers)
      System.out.println(str);

   }
}

