package thread;

public class MyThread extends Thread
{

 public void run()
 {
   System.out.println("New thread running ");
 }
 public static void main(String[] args)
 {
  System.out.println("Main thread running");	 
  MyThread th = new MyThread();
  Thread t = new Thread(th);
   
   t.start(); // This thread will execute statements inside run() method of MyThread object.
 }
}

 
