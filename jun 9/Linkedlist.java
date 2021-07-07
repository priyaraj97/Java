package arrayandlist;
import java.util.*;

public class Linkedlist 
	
{
	     public static void main(String args[]) 
	     {
	    	  
	       LinkedList<String> linkedlist=new LinkedList<String>();

	       linkedlist.add("priya");
	       linkedlist.add("raj");
	       linkedlist.add("rani");
	       linkedlist.add("gokul");
	       linkedlist.add("yuva");

	       System.out.println("Linked List Content: " +linkedlist);

	       linkedlist.addFirst("sam");
	       linkedlist.addLast("sam last");
	       System.out.println("LinkedList Content after addition: " +linkedlist);

	       Object firstvar1 = linkedlist.get(0);
	       System.out.println("First element: " +firstvar1);
	       linkedlist.set(0, "Samgokul");
	       Object firstvar2 = linkedlist.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);
	       
	       System.out.println("LinkedList after update of first and last element: " +linkedlist);

	       linkedlist.remove(1);
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

	       linkedlist.add(0, "Newly added item");
	       linkedlist.remove(2);
	       System.out.println("Final Content: " +linkedlist); 
	     }
	}

