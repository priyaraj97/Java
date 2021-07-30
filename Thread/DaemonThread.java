package thread;

public class DaemonThread implements Runnable
{
public void run()
{  

if(Thread.currentThread().isDaemon()){ 
    System.out.println(Thread.currentThread() + " is a daemon thread");  
 }  
else{   
  System.out.println(Thread.currentThread() + " is a user (normal) thread");  
 }
}  
public static void main(String[] args) 
{
	DaemonThread obj = new DaemonThread();
Thread t1 = new Thread(obj, "Thread 1");
 t1.setDaemon(true); 

Thread t2 = new Thread(obj, "Thread 2");
  t1.start(); 
  t2.start();
  
System.out.println("Main thread ending"); 
 }
}
