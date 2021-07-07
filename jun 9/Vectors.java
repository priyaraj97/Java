package arrayandlist;

import java.util.*;

public class Vectors {

   public static void main(String args[]) {
      
      Vector<String> vec = new Vector<String>(2);
      
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Grapes");
     
      System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());

      vec.addElement("Papaya");
      vec.addElement("Banana");
      vec.addElement("Amla");

      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());

      Enumeration en = vec.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }
}