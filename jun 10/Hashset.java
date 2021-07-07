package arrayandlist;

import java.util.HashSet;
public class Hashset 
{
   public static void main(String args[]) 
   {
      
      HashSet<String> hset = 
               new HashSet<String>();
   
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println("\n"+hset);
    }
}