package arrayandlist;

import java.util.Hashtable;
import java.util.Enumeration;

public class Hashtable1 {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;

   Hashtable<String, String> hashtable = new Hashtable<String, String>();
 
   hashtable.put("Key1","priya");
   hashtable.put("Key2","raj");
   hashtable.put("Key3","gokul");
   hashtable.put("Key4","yuva");
   hashtable.put("Key5","rani");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}
