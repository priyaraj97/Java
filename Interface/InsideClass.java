package com.interface2;

class InsideClass1  
{ 
  interface Vehicle 
  { 
    public int getNoOfWheels(); 
  } 
} 
class Bus implements InsideClass1.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
      return 6; 
  } 
} 
class Car implements InsideClass1.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
    return 4; 
  } 
} 
class Bike implements InsideClass1.Vehicle
{ 
  public int getNoOfWheels()
  { 
     return 2; 
   } 
}

	public class InsideClass
	{
   public static void main(String[] args) 
  { 
    Bus b = new Bus(); 
    System.out.println(b.getNoOfWheels()); 

    Car c = new Car(); 
    System.out.println(c.getNoOfWheels()); 

    Bike bk = new Bike(); 
    System.out.println(bk.getNoOfWheels()); 
   } 
}