package Task;
import java.util.*;
 
public class Listarith
{
     
static Node head;
static class Node
{
    int data;
    Node next;
};

static int subtractAlternateNode(Node head)
{
    int count = 0;
    int difference = 0;
     
    while (head != null)
    {
    	
            if (count % 2 == 0)
            if (difference == 0)
            {
                difference = head.data;
            }
            else
            {
                difference -= head.data;
            }
        
        count++;
     
        head = head.next;
    }
    return difference;
}
 
static void push(Node head_ref, int new_data)
{
    Node new_node = new Node();
    new_node.data = new_data;
    new_node.next = head_ref;
    head_ref = new_node;
    head = head_ref;
}

public static void main(String[] args)
{
    head = null;
    
    push(head, 12);
    push(head, 29);
    push(head, 11);
    push(head, 23);
    push(head, 8);
     
    System.out.printf(" %d ", subtractAlternateNode(head));
}
}