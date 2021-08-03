package com.interface2;

interface Perimeter 
{ 
  void msg(); 
  static int peri(int l, int b)
  { 
     return 2*(l + b); 
  } 
} 
class Rectangle implements Perimeter 
{ 
  public void msg()
  { 
     System.out.println("Perimeter of rectangle"); 
  } 
}
public class StaticInterface
{
public static void main(String[] args) 
{ 
   Perimeter p = new Rectangle(); 
     p.msg(); 
   int perimeter = Perimeter.peri(20,30); 
   System.out.println(perimeter); 
  } 
}
