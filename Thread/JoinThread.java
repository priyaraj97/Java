package thread;

class d implements Runnable
{
public void run()
{
 System.out.println("Child thread1 starts running");	
 for(int i = 1; i <= 3; i++)
 {
  System.out.println("I: " +i);	 
 }
 System.out.println("Child thread1 is ending");
 }
}
class B implements Runnable
{
public void run()
{	
 System.out.println("Child thread2 starts running");
 for(int j = 1; j <= 3; j++)
 {
  System.out.println("J: " +j);
 }
 System.out.println("Child thread2 is ending"); 
 }
}
public class JoinThread
{
public static void main(String[] args) throws InterruptedException 
{
 A a = new A();
 Thread t1 = new Thread(a);	
 
 B b = new B();
 Thread t2 = new Thread(b);
 
 t1.start(); 
 t1.join(); 

 t2.start(); 
 t2.join(); 

 System.out.println("Main thread is ending");
 }
}