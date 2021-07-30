package thread;

class Table 
{
void printTable(int x)
{
  synchronized(this) 
{
for(int i = 1; i <= 3; i++)
{  
 System.out.println(x * i);  
 try
 {  
   Thread.sleep(400);  
 }
catch(InterruptedException ie)
{
 System.out.println(ie);
 }  }}
}  
}
class Thread9 extends Thread
{
Table t;
Thread9(Table t)
{
 this.t = t;	
}
public void run()
{  
 t.printTable(2);
 }  
}
class Thread8 extends Thread
{
Table t;
Thread8(Table t)
{
 this.t = t;	
}	
public void run()
{  
 t.printTable(10); 
 }  
}
public class SynchronizedBlock
{
public static void main(String[] args) 
{
Table t = new Table();	
Thread9 t1 = new Thread9(t);
Thread8 t2 = new Thread8(t);
 t1.start(); 
 t2.start();
 }
}