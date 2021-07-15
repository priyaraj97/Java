package binomialheap;

import java.util.Scanner;
public class JavaBinomialHeapExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Binomial Heap Test\n\n");
		BinomialHeap bh = new BinomialHeap();
		char ch;
		do {
			System.out.println("\nBinomialHeap Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. delete ");
			System.out.println("3. size");
			System.out.println("4. check empty");
		    System.out.println("5. clear");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bh.insert(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter element to delete ");
				bh.delete(scan.nextInt());
				break;
			case 3:
				System.out.println("Size = " + bh.getSize());
				break;
			case 4:
				System.out.println("Empty status = " + bh.isEmpty());
				break;
			case 5:
				bh.makeEmpty();
				System.out.println("Heap Cleared\n");
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			bh.displayHeap();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
