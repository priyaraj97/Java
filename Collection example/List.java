package Task;
import java.util.*;
public class List {
	
		public static void main(String args[]){  
	      LinkedList<Integer> alist=new LinkedList<Integer>(); 
	      alist.add(34);
	      alist.add(4);
	      alist.add(76);
	      alist.add(64);
	      alist.add(12);
	      alist.add(76);
	      alist.add(97);
	      alist.add(12);
	      alist.add(54);
	      
	      
	      System.out.println("Max val: " + Collections.max(alist,null));   
	      System.out.println("Min val: " + Collections.min(alist,null));   
	      System.out.println("Count is: "+alist.size());
	      Object lastvar2 = alist.get(8);
	      System.out.println("Last element : " +lastvar2+"\n");
	      
	      System.out.println("Unsorted ArrayList: "+ alist );
          Collections.sort(alist);
          System.out.println("Sorted ArrayList "+ "in Ascending order : "+ alist);
          Collections.reverse(alist);
          System.out.println("Sorted ArrayList "+ "in Descending order : "+ alist+"\n");
          
          
          LinkedList<Integer> DuplicateElements = new LinkedList<Integer>();
          for(Integer ele: alist)
          {
        	  if(!DuplicateElements.contains(ele))
                  DuplicateElements.add(ele);
          } 
          System.out.println("Duplicate element in LinkedList: " + alist);
          System.out.println("Remove duplicate element in LinkedList: " + DuplicateElements+"\n");
          
          { 
           int i,j, sum = 0;
           for(i = 0; i < DuplicateElements.size(); i++)
           {
        	   sum=sum+alist.get(i);
        	   
        	   System.out.println("Addition: " + sum);
        	   
           }
           for(j = 0; j < DuplicateElements.size(); j++)
           {
        	   sum=sum-alist.get(j);
        	   System.out.println("Substraction: " + sum);
        	   
           }
          }
	}
}
        	             
             




