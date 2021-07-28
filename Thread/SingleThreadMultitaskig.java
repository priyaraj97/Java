package thread;

public class SingleThreadMultitaskig implements Runnable
{
 int a = 200, b = 165;	
public void run()
{
 addition(); 
 subtraction(); 
 multiplication(); 
}
void addition()
{
 int sum = a + b;
 System.out.println("Addition of two numbers: " +sum);
}
void subtraction()
{
 int sub = a - b;
 System.out.println("Subtraction of two numbers: " +sub);
}
void multiplication()
{
 int multiply = a * b;
 System.out.println("Multiplication of two numbers: " +multiply);
}
public static void main(String[] args)
{
 System.out.println("Main thread running");	 
 
  SingleThreadMultitaskig th = new SingleThreadMultitaskig();   
  Thread t = new Thread(th);
  t.start(); 
  }
}