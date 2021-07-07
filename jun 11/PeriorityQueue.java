package arrayandlist;

import java.util.PriorityQueue;
public class PeriorityQueue
{
    public static void main(String[] args)
    {
        
        PriorityQueue<String> queue = new PriorityQueue<String>(15);
        queue.add("tamil");
        queue.add("english");
        queue.add("maths");
        queue.add("science");
    
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());
        
        }
    }
}