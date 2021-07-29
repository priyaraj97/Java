package thread;

class Thread5 implements Runnable
{
static Thread t1;	
public void run()
{
 System.out.println("Thread is running");
 int i = 0;
while(i < 10)
{
 System.out.println("i: " +i);
 if(i == 5)	
  t1.stop();
  i = i + 1;
  }
}
}
public class DeadState
{
public static void main(String[] args) 
{
 Thread5 th1 = new Thread5();
 Thread t1 = new Thread(th1);
  t1.start();
  t1.start(); // Calling the start() method again to alive a dead thread.
 }
}
