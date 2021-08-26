import java.util.*;
  
class StreamLimit {
  
    public static void main(String[] args)
    {
  
        List<Integer> list = new ArrayList<Integer>();
  
        list.add(-2);
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
  
        int limit = 4;
        int count = 0;
        Iterator<Integer> it = list.iterator();
  
        while (it.hasNext()) {
            it.next();
            count++;
  
            if (count > limit) {
  
                it.remove();
            }
        }
  
        System.out.print("New stream of length N"+ " after truncation is : ");
          for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}