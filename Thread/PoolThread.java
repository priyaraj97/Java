package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadD implements Runnable
{
 private char charToPrint; 
 public ThreadD(char c)
 {
  charToPrint = c;	 
 }
@Override
public void run()
{
 for(int i = 1; i <= 3; i++){
  System.out.println(charToPrint); 
 }
 }
}
class ThreadF implements Runnable
{
 private int n;
 public ThreadF(int n)
 {
  this.n = n;	 
 }
@Override 
public void run()
{ 
for(int i = 1; i <= n; i++){
 System.out.println(i);	
  }
 }
}
public class PoolThread
{
public static void main(String[] args) 
{
 ExecutorService executor = Executors.newFixedThreadPool(3);
 
ThreadD t1 = new ThreadD('a'); 
ThreadD t2 = new ThreadD('b');
ThreadF t3 = new ThreadF(5);
 
   executor.execute(t1);
   executor.execute(t2);
   executor.execute(t3);
 
   executor.shutdown();
  }
}

