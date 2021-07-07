package com.HierarchyInherit;

class Traineeprogrammer extends SingleInherit 
{
	int bonus=3000;  
	 public static void main(String args[])
	 {  
	   Programmer p=new Programmer();  
	   Traineeprogrammer t=new Traineeprogrammer();
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	   System.out.println("\n");
	   System.out.println("Traineeprogrammer salary is:"+t.salary);  
	   System.out.println("Bonus of Trainee Programmer is:"+t.bonus); 
	}  
	}  


