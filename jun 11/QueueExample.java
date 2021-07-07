/**
 * 
 */
package arrayandlist;

import java.util.*;
public class QueueExample {
	 
   public static void main(String[] args) {
	  
      Queue<String> q = new PriorityQueue<String>();
	
      q.add("priya");
      q.add("raj"); 
      q.add("Gokul");
      q.add("yuva");
      q.add("Dharshini");
	    
      System.out.println("Elements in Queue:"+q);

      System.out.println("Removed element: "+q.remove());
	   
      System.out.println("Head: "+q.element());
	   
      System.out.println("poll(): "+q.poll());
	   
      System.out.println("peek(): "+q.peek());
	   
      System.out.println("Elements in Queue:"+q);
   }
}
