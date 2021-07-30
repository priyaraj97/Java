package thread;

class H
{
void display1(H obj2)
{
 System.out.println("Thread1 waiting for thread2 to release lock");
 synchronized(obj2){
  System.out.println("Deadlock occurred"); 
 }
 }
void display2(H obj1)
{
 System.out.println("Thread2 waiting for thread1 to release lock");
 synchronized(obj1){
   System.out.println("Deadlock occurred"); 
  }
 } 
}
class ThreadJ extends Thread
{
 H obj1, obj2;
 ThreadJ(H obj1, H obj2)
 {
   this.obj1 = obj1;
   this.obj2 = obj2;
 }
public void run()
{
 synchronized(obj1){
  try {
	Thread.sleep(1000);  
  }
catch(InterruptedException ie) {
 System.out.println(ie);	
}
obj2.display2(obj2);  
  }
}
}
class ThreadH extends Thread 
{
H obj1, obj2;
ThreadH(H obj1, H obj2)
{
 this.obj1 = obj1;
 this.obj2 = obj2;
}
public void run()
{
synchronized(obj2){
try {
 Thread.sleep(1000);  
}
catch(InterruptedException ie) {
  System.out.println(ie);	
  }
obj1.display1(obj1);
 }
}
}
public class DeadLock {
public static void main(String[] args) 
{
H obj1 = new H();
H obj2 = new H();

ThreadJ t1 = new ThreadJ(obj1, obj2);
ThreadH t2 = new ThreadH(obj1, obj2);
  t1.start();
  t2.start();
 }
}