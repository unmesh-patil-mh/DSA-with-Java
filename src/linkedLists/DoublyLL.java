package linkedLists;


public class DoublyLL {
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLL() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next , Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void insertStart(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		
		head = node;
		
		if(tail == null) {
			tail = node;
		}
		
		size++;
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		
		if(tail == head) {
			insertStart(val);
		}
		
		tail.next = node;
		node.prev = tail;
		
		tail = node;
		
		size++;
	}
	
	public void insertIndex(int val , int index) {		
		if(index == 0) {
			insertStart(val);
			return;
		}
		
		if(index == size) {
			insertLast(val);
			return;
		}
		
	    Node temp = head;
	    for (int i = 0; i < index - 1; i++) {  // stop one before index
	        temp = temp.next;
	    }

	    Node node = new Node(val);
	    node.next = temp.next;
	    node.prev = temp;

	    if (temp.next != null) {
	        temp.next.prev = node;
	    }
	    temp.next = node;

	    size++;
	}
	
	// Get Function to iterate towards the index
	public Node get(int index) {
		Node node = head;
		for(int i = 0; i < index ; i++) {
			node = node.next;
		}
		return node;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.print("END");
	}
	
	public void displayRev() {
		Node last = tail;
		
		while(last != null) {
			System.out.print(last.val + " --> ");
			last = last.prev;
		}
		System.out.print("START");
	}
}
