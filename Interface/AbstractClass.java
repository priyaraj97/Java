package com.interface2;

abstract class AbstractClass1 
{ 
	    int a; // Not require initialization. 
	    final int b = 20; // Final variable. 
	    static int c = 30; // static variable. 

	// Declaration of abstract and non-abstract methods. 
	   abstract void m1(); 
	   static void m2()
	   { 
	      System.out.println("Static method in abstract class"); 
	   } 
	// Default implementation of instance method. 
	   void m3() { // Concrete method. 
	     System.out.println("Instance method in abstract class"); 
	    } 
	// Declaration of constructors to initialization of instance variable. 
	    AbstractClass1()
	    { 
	      int a = 10; 
	      System.out.println("Value of a; "+a); 
	    } 
	// Declaration of static and non-static blocks. 
	   static { 
	      System.out.println("Static block in abstract class"); 
	   } 
	  { 
	    System.out.println("Instance block in abstract class"); 
	  } 
	// Declaration of private & protected members. 
	   private void m4()
	   { 
	      System.out.println("Private method"); 
	    } 
	   protected void m5()
	   { 
	     System.out.println("Protected method"); 
	   } 
	} 
	class A extends AbstractClass1 
	{ 
	  void m1()
	  { 
	     System.out.println("Implementation of abstract method"); 
	  } 
	} 
	public class AbstractClass
	{ 
	  public static void main(String[] args) 
	  { 
	    A a = new A(); 
	    System.out.println("Value of b: " +a.b); 
	    System.out.println("Value of c: " +AbstractClass1.c); 
	     a.m1(); 
	    AbstractClass1.m2(); 
	     a.m3(); 
	     a.m5(); 
	   } 
	}
