package arrayandlist;

import java.util.Deque;
import java.util.ArrayDeque;

public class Dequeue
{

   public static void main(String[] args) {
		
       Deque<String> dq = new ArrayDeque<String>();
	
	dq.add("Java");
	dq.add("Css");
	dq.addLast("Html");
	dq.addFirst("Html5");
	dq.add("Javascript");
	    
	System.out.println("Elements in Deque:"+dq);

	System.out.println("Removed element: "+dq.removeLast());
	  
	System.out.println("Head: "+dq.element());
	    
	System.out.println("poll(): "+dq.pollLast());
	
	System.out.println("peek(): "+dq.peek());
	
	System.out.println("Elements in Deque:"+dq);
   }
}
