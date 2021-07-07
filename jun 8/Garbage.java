package com.superclass;

public class Garbage {
		
		public static void main(String[] args) throws InterruptedException
		{
			Garbage t1 = new Garbage();
			Garbage t2 = new Garbage();
			
			// Nullifying the reference variable
			t1 = null;
			
			// requesting JVM for running Garbage Collector
			System.gc();
			
			// Nullifying the reference variable
			t2 = null;
			
			// requesting JVM for running Garbage Collector
			Runtime.getRuntime().gc();
		
		}
		
		// finalize method is called on object once
		// before garbage collecting it
		protected void finalize() throws Throwable
		{
			System.out.println("Garbage collector called");
			System.out.println("Object garbage collected : " + this);
		}
	}
