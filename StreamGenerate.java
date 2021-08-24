import java.util.*;
import java.util.stream.Stream;
  
class StreamGenerate {
   
    public static void main(String[] args) {
    
    Stream.generate(new Random()::nextDouble)
    .limit(8).forEach(System.out::println); 
    }
}
