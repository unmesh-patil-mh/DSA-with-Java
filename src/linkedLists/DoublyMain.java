package linkedLists;

public class DoublyMain {
	public static void main(String[] args) {
		DoublyLL list = new DoublyLL();
		list.insertStart(5);
		list.insertStart(10);
		list.insertStart(15);
		
		list.insertLast(20);
		
		list.insertIndex(100, 2);
		
		list.display();
		
		System.out.println();
		
		list.displayRev();
	}
}
