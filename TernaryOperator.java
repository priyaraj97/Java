public class TernaryOperator {

   public static void main(String args[]) {
        int x, y;
        x = 50;
        y = (x == 30) ? 100: 200;
	System.out.println( "y: "+y);

	y = (x == 50) ? 100: 200;
	System.out.println( "y: "+y);
   }
}