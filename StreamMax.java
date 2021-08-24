
import java.util.*;
import java.util.Optional;
  
class StreamMax {
  
    public static void main(String[] args)
    {
        String[] array = { "Geeks", "for", "GeeksforGeeks",
                           "GeeksQuiz" };
        Optional<String> MAX = Arrays.stream(array).max((str1, str2) -> Character.compare(str1.charAt(str1.length() - 1), str2.charAt(str2.length() - 1)));
          if (MAX.isPresent()) 
            System.out.println(MAX.get());        
        else 
            System.out.println("-1");        
    }
}