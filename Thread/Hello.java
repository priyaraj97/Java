package thread;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj = Thread.currentThread();
		
		System.out.println("Current thread is:"+obj);
		System.out.println(" name of Current thread is:"+obj.getName());

	}

}
