package fiboheap;

import java.util.HashMap;
import java.util.Map;
public class FiboHeap {    
    public static void main(String[] args){
        FiboHeap fH = new FiboHeap();
		fH.insert(4);
		fH.insert(2);
		fH.insert(3);
		fH.insert(1);
		fH.print();
		
		//System.out.println(fH.getMin());
		System.out.println("extracting min : "+fH.extractMin());
		fH.print();
		fH.insert(5);
		fH.insert(6);
		fH.print();
		System.out.println("extracting min : "+fH.extractMin());
		fH.print();
		System.out.println("extracting min : "+fH.extractMin());
		fH.print();
		fH.insert(7);
		fH.insert(8);
		fH.insert(9);
		fH.insert(1);
		fH.print();
		System.out.println("extracting min : "+fH.extractMin());
		fH.print();
		fH.insert(2);
		fH.insert(5);
		fH.insert(10);
		fH.insert(11);
		fH.print();
		System.out.println("extracting min : "+fH.extractMin());
		fH.print();
		System.out.println("decreaase : "+9+" - "+12);
		fH.decreaseKey(9, 12);
		fH.print();
		System.out.println("decreaase : "+11+" - "+9);
		fH.decreaseKey(11, 9);
		fH.print();
		System.out.println("decreaase : "+10+" - "+11);
		fH.decreaseKey(10, 11);
		fH.print();
		System.out.println("decreaase : "+8+" - "+3);
		fH.decreaseKey(8, 3);
		fH.print();
		System.out.println("decreaase : "+6+" - "+2);
		fH.decreaseKey(6, 2);
		fH.print();
    }
	
	private static class LinkedNode {
		Node node;
		LinkedNode next;
		LinkedNode pre;
		LinkedNode(Node node){
			this.node = node;
		}
	}
	
	private static class Node {
		int value;
		Node parent;
		Node next;
		Node child;
		int order;
		boolean isMarked;
		
		Node(int value){
			this.value = value;
		}
	}
	
	private LinkedNode minHead;
	
	public void insert(int value){
		if(minHead == null) minHead = new LinkedNode(new Node(value));
		else {
			LinkedNode next = minHead.next;
			minHead.next = new LinkedNode(new Node(value));
			minHead.next.next = next;
			minHead.next.pre = minHead;
			if(next != null) next.pre = minHead.next;
			else {
				next = minHead.next;
				next.next = minHead;
				minHead.pre = next;
			}
		}
		
		if(minHead.next != null && minHead.next.node.value < minHead.node.value) minHead = minHead.next;
	}
	
	public int getMin(){
		if(minHead == null) return -1;
		return minHead.node.value;
	}
	
	public int extractMin(){
		int min = getMin();
		if(min == -1) return -1;
		
		if(minHead.node.order == 0) {
			if(minHead.pre != minHead.next){
				minHead.pre.next = minHead.next;
				minHead.next.pre = minHead.pre;
				minHead = minHead.next;
			}else if(minHead.next != null){
				minHead = minHead.next;
				minHead.next = minHead.pre = null;
				minHead = getNewMin(minHead);
			} else minHead = null;
			union(minHead);
			return min;
		}
		
		LinkedNode next = minHead.next;
		LinkedNode pre = minHead.pre;
		int order = minHead.node.order;
		Node node = minHead.node.child;
		while(order > 0){
			node.parent = null;
			if(next != null){
				next.pre = new LinkedNode(node);
				next.pre.next = next;
				if(pre == next) next.next = next.pre;
				if(pre == null) pre = next;
				next = next.pre;
			} else next = minHead = new LinkedNode(node);
			node = node.next;
			order--;
		}
		
		next.pre = pre;
		if(pre != null) pre.next = next;
		minHead = getNewMin(next);
		union(minHead);
		
		return min;
	}
	
	public void decreaseKey(int key, int newValue){
		Node node = findKey(minHead, key);
		if(node == null) return;
		
		node.value = newValue;
		if(node.parent == null && node.child == null) return;
		if(node.parent != null && node.value < node.parent.value) lessThanParentViolation(node);
		else if(node.child != null){
			Node n = node.child;
			while(n != null) {
				if(n.value < node.value){
					greaterThanChildViolation(node, n);
					break;
				}
				n = n.next;
			}
		}
	}
	
	private void lessThanParentViolation(Node node){
		if(node.parent == null) return;
		
		if(node == node.parent.child) node.parent.child = node.next;
		else {
			Node n = node.parent.child;
			while(n.next != node) n = n.next;
			n.next = node.next;
			node.parent = null;
		}
		
		if(!node.parent.isMarked){
			if(node.parent.parent != null) node.parent.isMarked = true;
			node.isMarked = false;
		} else lessThanParentViolation(node.parent);
		
		LinkedNode next = minHead.next;
		minHead.next = new LinkedNode(node);
		minHead.next.next = next;
		minHead.next.pre = minHead;
		if(next != null) next.pre = minHead.next;
		else {
			next = minHead.next;
			next.next = minHead;
			minHead.pre = next;
		}
	}
	
	private void greaterThanChildViolation(Node node, Node child){
		node.value ^= child.value;
		child.value ^= node.value;
		node.value ^= child.value;
		
		node = child;
		if(node.child == null) return;
		Node n = node;
		while(n != null) {
			if(n.value < node.value){
				greaterThanChildViolation(node, n);
				break;
			}
			n = n.next;
		}
	}
	
	private Node findKey(LinkedNode head, int key){
		if(head == null) return null;
		Node c = findKey(head.node, key);
		if(c != null) return c;
		return findKey(head == minHead.pre ? null : head.next, key);
	}
	
	private Node findKey(Node node, int key){
		if(node == null) return null;
		if(node.value == key) return node;
		if(node.child == null) return null;
		
		Node n = node.child; 
		while(n != null){
			Node c = findKey(n, key);
			if(c != null) return c;
			n = n.next;
		}
		
		return null;
	}
	
	private void union(LinkedNode head){
		if(head == null || head.next == null) return;
		Map<Integer, LinkedNode> orderToLink = new HashMap<>();	
		while(orderToLink.get(head.node.order) != head){
			if(orderToLink.containsKey(head.node.order)){
				head = merge(orderToLink, head);
			} 
			orderToLink.put(head.node.order, head);
			if(head.next == null) break;
			head = head.next;
		}
		
		minHead = getNewMin(head);
	}
	
	private LinkedNode merge(Map<Integer, LinkedNode> orderToLink, LinkedNode current){
		LinkedNode previous = orderToLink.get(current.node.order);
		orderToLink.remove(current.node.order);
		
		if(previous.pre == previous.next){
			previous.pre.next = null;
			previous.pre.pre = null;
		} else{
			previous.pre.next = previous.next;
			previous.next.pre = previous.pre;
		}
		previous.pre = previous.next = null;
		
		if(current.node.value > previous.node.value){
			previous.pre = current.pre;
			previous.next = current.next;
			if(current.pre != null) current.pre.next = previous;
			if(current.next != null) current.next.pre = previous;
			current.next = current.pre = null;
			
			LinkedNode h = current;
			current = previous;
			previous = h;
		}


		
		current.node.order += 1;
		Node node = current.node.child;
		current.node.child = previous.node;
		previous.node.next = node;
		previous.node.parent = current.node;
		
		if(orderToLink.containsKey(current.node.order)) current = merge(orderToLink, current);
		return current;
	}
	
	private LinkedNode getNewMin(LinkedNode head){
		if(head == null || head.next == null) return head;
		LinkedNode minHead = null;
		
		while(minHead != head){
			if(minHead == null || minHead.node.value > head.node.value) minHead = head;
			head = head.next;
		}
		
		return minHead;
	}
	
	
	//to print result
	public void print(){
		print(minHead);
	}
	
	private void print(LinkedNode head){
		if(head == null) return;
		System.out.println();
		printNode(head.node, 1);
		if(head.next != minHead) print(head.next);
	}
	
	private void printNode(Node node, int space){
		if(node == null) return;
		int s = space;
		while(s > 0){
			System.out.print(" ");
			s--;
		}


		System.out.println(node.value+(node.isMarked ? ".":""));
		if(node.child == null) return;
		Node n = node.child;
		while(n != null){
			printNode(n, space + 1);
			n = n.next;
		}
	}
}






