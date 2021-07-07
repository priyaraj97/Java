public class BitwiseOperator {
  public static void main(String args[]) {

     int a = 34;  
     int b = 24;  
     int result = 0;

     result = a & b;   
     System.out.println("a & b: "+result);

     result = a | b;   
     System.out.println("a | b: "+result);
    
     result = a ^ b;   
     System.out.println("a ^ b: "+result);
    
     result = ~a;   
     System.out.println("~a: "+result);
    
     result = a << b;
     System.out.println("a << b: "+result); 
     result = a >> b;   
     System.out.println("a >> b: "+result);
  }
}