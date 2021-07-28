package thread;

public class Multitasking extends Thread
{
  String task;
 
Multitasking(String task)
{
  this.task = task;
}
public void run()
{
 for(int i = 1; i <= 5; i++)
 {
  System.out.println(task+ " : " +i); 	
  try
 {
    Thread.sleep(2000); 
 }
 catch(InterruptedException ie) {
   System.out.println(ie.getMessage());	
  }
 } 
} 
public static void main(String[] args) 
{
  Multitasking th1 = new Multitasking("Cut the ticket"); 
  Multitasking th2 = new Multitasking("Show your seat number");
 
  Thread t1 = new Thread(th1);
  Thread t2 = new Thread(th2);
  t1.start();
  t2.start();
  }
}