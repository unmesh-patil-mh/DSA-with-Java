package linkedLists;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	private class Node{
		private int val;
		private Node next;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val,Node next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public void addStart(int val) {
		Node node = new Node(val);
		
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		
		size++;
	}
	
	public void addLast(int val) {
		if(tail == null) {
			addStart(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insert(int val , int index) {
		if(index == 0) {
			addStart(val);
			return;
		}
		
		if(index == size) {
			addLast(val);
			return;
		}
		
		Node temp = head;
		
		for(int i = 0 ; i < index ; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val,temp.next);
		temp.next = node;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.val;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		
		size--;
		return val;
	}
	
	// Get Function to iterate towards the index
	public Node get(int index) {
		Node node = head;
		for(int i = 0; i < index ; i++) {
			node = node.next;
		}
		return node;
	}
	
	public int deleteLast() {
		if(size <= 1) {
			deleteFirst();
		}
		
		Node secondLast = get(size - 2);
		int val = tail.val;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}
	
	
	public int deleteIndex(int index) {
		if(index == 0) {
			deleteFirst();
		}
		
		if(index == size - 1) {
			deleteLast();
		}
		
		Node prev = get(index - 1);
		int val = prev.next.val;
		prev.next = prev.next.next;
		size--;
		return val;
	}
	
	public Node find(int val) {
		Node temp = head;
		while(temp != null) {
			if(temp.val == val) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.print("END");
	}
}
