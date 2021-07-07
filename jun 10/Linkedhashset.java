package arrayandlist;

import java.util.LinkedHashSet;
public class Linkedhashset
{
     public static void main(String args[]) 
     {
         
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();
         
         lhset.add("priya");
         lhset.add("raj");
         lhset.add("gokul");
         lhset.add("yuva");
         lhset.add("rani");
         lhset.add("sam");
         System.out.println(lhset);
         
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();
       
         lhset2.add(99);
         lhset2.add(7);
         lhset2.add(0);
         lhset2.add(67);
         lhset2.add(89);
         lhset2.add(66);
         System.out.println(lhset2);
    }
}