import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.LongStream;

  
class ConcatStream {
  
    public static void main(String[] args)
    {
  
     Stream<String> stream1 = Stream.of("Geeks", "for", "GeeksforGeeks");
     Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for");
     Stream.concat(stream1, stream2).distinct().forEach(element -> System.out.println(element));
    	 
    	LongStream Stream1 = LongStream.of(152, 162);
        LongStream Stream2 = LongStream.of(172, 182);
   
        LongStream.concat(Stream1, Stream2)
             .forEach(element -> System.out.println(element));
    	
    }
}