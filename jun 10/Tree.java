package arrayandlist;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Tree {

   public static void main(String args[]) {

             TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
     
      tmap.put(1, "priya");
      tmap.put(23, "raj");
      tmap.put(70, "gokul");
      tmap.put(4, "yuva");
      tmap.put(2, "rani");
      
      Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) 
      {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

   }
}


