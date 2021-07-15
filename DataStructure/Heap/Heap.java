package heap;
	
import java.util.Scanner;
class Heap
	{
	     private int[] heapArray;
	     private int maxSize; 
	     private int heapSize; 
	     public Heap(int mx) 
	   
	     {
		maxSize = mx;
		heapSize = 0;
		heapArray = new int[maxSize]; 
	    }
	        public boolean isEmpty() 
	    {
	        return heapSize == 0;
	    }
	        public boolean insert(int ele) 
	    {
	        if (heapSize + 1 == maxSize)
	        return false;
			heapArray[++heapSize] = ele;
			int pos = heapSize;
	        while (pos != 1 &&ele>heapArray[pos/2])
        {
			heapArray[pos] = heapArray[pos/2];
			pos /=2;
		}
			heapArray[pos] = ele;    
	        return true;
	  } 
		    public int remove()
	    {
			int parent, child;
			int item, temp;
	        if (isEmpty() )
	        throw new RuntimeException("Error : Heap empty!");
	        item = heapArray[1];
	        temp = heapArray[heapSize--];
	        parent = 1;
	        child = 2;
	        while (child <= heapSize)
	        {
	            if (child <heapSize&&heapArray[child] <heapArray[child + 1])
	                child++;
	            if (temp >= heapArray[child])
	                break;
	            heapArray[parent] = heapArray[child];
	            parent = child;
	            child *= 2;
	        }
	        	heapArray[parent] = temp;
	         return item;
	    }
	    public void displayHeap()
	    {
	System.out.print("\nHeap array: ");    
	for(int i = 1; i<= heapSize; i++)
	System.out.print(heapArray[i] +" ");
	System.out.println("\n");
	    }  
	}
