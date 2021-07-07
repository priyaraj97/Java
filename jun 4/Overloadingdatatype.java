package com.superclass;


	class Overloadingdatatype
	{  
		static int add(int a, int b)
		{
			return a+b;
			}  
		static double add(double a, double b){return a+b;}  
		}  
		class TestOverloading2
		{  
		public static void main(String[] args)
		{  
		System.out.println(Overloadingdatatype.add(11,11));  
		System.out.println(Overloadingdatatype.add(12.3,12.6));  
		}
		}  


