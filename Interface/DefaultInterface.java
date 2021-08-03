package com.interface2;

     interface C 
     {
	 public default int m1() 
	 {
	  return 10;	 
	 }
	}
	interface B 
	{
	 public default int m1()
	 {
	   return 20;	 
	 }
	}
 public class DefaultInterface implements C, B 
 {
	public static void main(String[] args) 
	{
		DefaultInterface  ab = new DefaultInterface ();
	    System.out.println(ab.m1());
	  }

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return B.super.m1();
	}
	}