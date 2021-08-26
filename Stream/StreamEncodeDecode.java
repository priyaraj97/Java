import java.util.Base64;  
public class StreamEncodeDecode {  
    public static void main(String[] args) {  
         
        Base64.Encoder encoder = Base64.getEncoder();  
        byte Arr[] = {1,2};  
        byte Arr2[] = encoder.encode( Arr);  
        System.out.println("Encoded byte array: "+ Arr2);  
        byte Arr3[] = new byte[5];                
        int x = encoder.encode(Arr, Arr3);    
        System.out.println("Encoded byte array written to another array: "+Arr3);  
        System.out.println("Number of bytes written: "+x);  
      
        String str = encoder.encodeToString("JavaTpoint".getBytes());  
        System.out.println("Encoded string: "+str);  
       
        Base64.Decoder decoder = Base64.getDecoder();  
        
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  
    }  
}  