package sample;

class Sample3
{
	void Sam()

   {
	      int a=8;
          int b=5;
          
    }
}
class Subclass extends Sample3
{
	void Sub()
	{
     	int c=4;
		
	}
}

public class Single
{
public static void main(String arg[])
{
	Sample3 obj = new Sample3();
	obj.Sam();
	System.out.println("Values:"+obj);
	
	}
}


