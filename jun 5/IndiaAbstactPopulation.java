package com.superclass;

abstract class AbstractPopulation 
{
abstract void population();
}
				
	class Kerala extends AbstractPopulation
		{
			void population()
			{
			long Keralapopulation=18367654L;
			System.out.println("Keralapopulation:"+Keralapopulation);
		}
		}
		
			class Tamilnadu extends AbstractPopulation
			{
				void population()
				{
				long Tamilnadupopulation=18367654L;
				System.out.println("Tamilnadupopulation:"+Tamilnadupopulation);
			}
			}
       class IndiaAbstractPopulation
       {
			public static void main(String arg[])
       {
    	   AbstractPopulation  obj = new Kerala();
    	   AbstractPopulation  obj1 = new Tamilnadu();
    	   obj1.population();
    	   obj.population();
    	  
       }         	     
       }		

