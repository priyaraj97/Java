public class RelationalOperator{
   public static void main(String args[]) {
      int x = 60;
      int y = 90;
      if (x==y) 
{
	 System.out.println("x and y are equal");
      }
      else{
	 System.out.println("x and y are not equal");
      }

      if( x != y ){
	 System.out.println("x and y are not equal");
      }
      else{
	 System.out.println("x and y are equal");
      }

      if( x > y ){
	 System.out.println("x is greater than y");
      }
      else{
	 System.out.println("x is not greater than y");
      }

      if( x >= y ){
	 System.out.println("x is greater than or equal to y");
      }
      else{
	 System.out.println("x is less than y");
      }

      if( x < y ){
	 System.out.println("x is less than y");
      }
      else{
	 System.out.println("x is not less than y");
      }

      if( x <= y){
	 System.out.println("x is less than or equal to y");
      }
      else{
	 System.out.println("x is greater than y");
      }
   }
}