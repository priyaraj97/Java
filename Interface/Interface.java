package com.interface2;

 interface AA { // One keyword: interface. 
	  int x = 20; // Interface variable must be initialized at the time of declaration. By default interface variable is public, static, and final. 
	  void m1(); // By default, Interface method is public and static. 

	// Here, we cannot declare instance variables, instance methods, constructors, static, and non-static block. 
	  } 
	interface BB 
	{ 
	  int y = 20; 
	  void m2(); 
	 } 
	class CC implements AA, BB { // Multiple Inheritance. 

	 public void m1()
	 { 
	   System.out.println("Value of x: " +x); 
	   System.out.println("m1 method"); 
	  } 
	public void m2()
	{ 
	   System.out.println("Value of y: " +y); 
	   System.out.println("m2 method"); 
	 } 
	} 
	public class Interface 
	{ 
	  public static void main(String [] args)
	  { 
	    CC c = new CC(); 
	     c.m1(); 
	     c.m2(); 
	  } 
	}