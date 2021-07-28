package thread;

public class Thread1 implements Runnable
{
 public void run()
 {
  System.out.println("New thread running ");
  
  for(int i = 1; i <= 5; i++)
  {
   System.out.println("Thread"+i);  
  }
 System.out.println(Thread.currentThread());
}
public static void main(String[] args)
{
 System.out.println("Main thread running");	 
 
   Thread1 th = new Thread1();

   Thread t = new Thread(th);
   
   t.start(); 
 }
}