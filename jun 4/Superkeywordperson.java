package com.superclass;

public class Superkeywordperson {
	
		int id;  
		String name;  
		Superkeywordperson(int id,String name){  
		this.id=id;  
		this.name=name;  
		}  
		}  
		class Emp extends Superkeywordperson {  
		float salary;  
		Emp(int id,String name,float salary)
		{  
		super(id,name);
		this.salary=salary;
		System.out.println(id+" "+name+" "+salary);
		 
		}  
		 
		}  
		class TestSuper5{  
		public static void main(String[] args){  
		Emp e1=new Emp(1,"priyadhrashini",55000f);  
		}
		}  


