import java.util.*;

class LinkedList {
	
	class Node {
		int data;
		Node next;
		Node (int d) {
			this.data = d;
			this.next = null;
		}
	}

	Node reverse (Node node){
		Node last = null;
		while(node != null) {
			Node next = node.next;
			node.next = last;
			last = node;
			node = next;
		}
		return last;
	}
	
	void display() {
		
	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();

		int testCases = sc.nextInt();
		
		for(int i=0; i< testCases; i++ ) {
			list.reverse(sc.nextInt());
		}
		
		list.display();		
	}
}

