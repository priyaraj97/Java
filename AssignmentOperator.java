public class AssignmentOperator {
   public static void main(String args[]) {
      int a = 5;
      int b = 10;

      b = a;
      System.out.println("= Output: "+b);

      b += a;
      System.out.println("+= Output: "+b);
	      
      b -= a;
      System.out.println("-= Output: "+b);
	      
      b *= a;
      System.out.println("*= Output: "+b);
	      
      b /= a;
      System.out.println("/= Output: "+b);
	      
      b %= a;
      System.out.println("%= Output: "+b);
   }
}