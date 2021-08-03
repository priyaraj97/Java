package com.interface2;

interface InsideInterface1
{ 
  void m1(); // Outer interface contains m1() method. 

 interface Inner 
 { 
   void m2(); // Inner interface contains m2() method. 
  } 
} 
// Implementation of top-level interface: 
   class MyClass1 implements InsideInterface1 
   { 
     public void m1()
     { 
       System.out.println("Hello"); 
     } 
   } 
// Implementation of inner interface: 
   class MyClass2 implements InsideInterface1.Inner 
   { 
     public void m2()
     { 
       System.out.println("Java"); 
     } 
    } 
public class InsideInterface 
{ 
  public static void main(String[] args) 
  { 
    MyClass1 c1 = new MyClass1(); // Creating object of class MyClass1. 
     c1.m1(); // Calling m1() method.
 
    MyClass2 c2 = new MyClass2(); // Creating object of class MyClass2. 
     c2.m2(); // Calling m2() method. 
   } 
}