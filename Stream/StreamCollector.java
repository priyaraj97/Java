import java.util.Collection;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
  
class StreamCollector 
{
      public static void main(String[] args)
    {
  
        Stream<String> s = Stream.of("6.8", "87", "49");
        Collection<String> names = s.collect(Collectors.toCollection(TreeSet::new));
  
        System.out.println(names);
    }
}