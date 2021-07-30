package thread;

 class F extends Thread
{
 public volatile boolean flag = true;

@Override
public void run(){
 System.out.println("Thread starts running");	

 while(flag)
 {
  try{
	System.out.println("Thread going to sleep");
	Thread.sleep(1000);
  }
 catch(InterruptedException ie){
	ie.printStackTrace(); 
 }
  }
 System.out.println("Thread stopped..."); 
}
public void stopThread(){
  this.flag = false;	
 }
}
public class volatileKeyword {
public static void main(String[] args) {
 F a = new F();
 Thread t = new Thread(a);
 t.start(); // Thread started.
 
try {
 Thread.sleep(3000); // Main thread will sleep for 3 seconds.	
}
catch(InterruptedException ie){
 ie.printStackTrace();	
}
   a.stopThread();
	}
}