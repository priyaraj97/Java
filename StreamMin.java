import java.util.*;
  
class StreamMin {
  
    public static void main(String[] args)
    {
  
        String[] array = { "Geeks", "for", "GeeksforGeeks","GeeksQuiz" };
        Optional<String> MIN = Arrays.stream(array).min((str1, str2) ->Character.compare(str1.charAt(str1.length() - 1),str2.charAt(str2.length() - 1)));
  
        if (MIN.isPresent()) 
            System.out.println(MIN.get()); 
        else
            System.out.println("-1"); 
    }
}