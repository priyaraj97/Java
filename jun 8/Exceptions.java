package com.superclass;

public class Exceptions {
	
		   public static void main(String args[]){
		     try{
		         int a[]=new int[7];
		         a[4]=30;
		         System.out.println("First print statement in try block");
		     }
		     catch(ArithmeticException e){
		        System.out.println("Warning: ArithmeticException");
		     }
		     catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("Warning: ArrayIndexOutOfBoundsException");
		     }
		     catch(StringIndexOutOfBoundsException e){
		   	  System.out.println("StringIndexOutOfBoundsException!!");
		     }
		     catch(NullPointerException e){
			 		System.out.println("NullPointerException..");
			 	}
		     	 catch(Exception e){
		        System.out.println("Warning: Some Other exception");
		     }
		   System.out.println("Out of try-catch block...");
		  }
		}