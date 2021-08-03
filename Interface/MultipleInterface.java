package com.interface1;

interface FirstInterface {
	  public void myMethod(); 
	  
	}
	interface SecondInterface {
	  public void myOtherMethod();
	}
	class DemoClass implements FirstInterface, SecondInterface
	{
	  public void myMethod() 
	  {
		  int id= 3;
	    System.out.println("ID:"+id);
	  }
	  public void myOtherMethod() 
	  {
		  String name = "priya";
	    System.out.println("Name:"+name);
	  }
	}
	class MultipleInterface
	{
	  public static void main(String[] args)
	  {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }
	}