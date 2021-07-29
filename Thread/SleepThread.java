package thread;

class c implements Runnable
{
public void run()
{
for(int i = 1; i <= 3; i++)
{
 try 
 {
  Thread.sleep(500);
 } 
catch (InterruptedException ie) 
{
  ie.printStackTrace();
 }	
System.out.println(Thread.currentThread() + " I: " +i); 
 }
}
}
public class SleepThread
{
public static void main(String[] args) 
{
A a1 = new A();
Thread t1 = new Thread(a1, "First Child Thread");

A a2 = new A();
Thread t2 = new Thread(a2, "Second Child Thread");

t1.start();
t2.start();
 }
}