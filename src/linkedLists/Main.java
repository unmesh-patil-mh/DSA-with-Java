package linkedLists;


public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addStart(1);
		list.addStart(4);
		list.addStart(5);
		
		list.addLast(8);
		
		list.insert(6, 1);
		
//		System.out.println(list.deleteFirst());
		
//		System.out.println(list.deleteLast());
		
//		System.out.println(list.deleteIndex(1));
		
		System.out.println(list.find(6));
		
		list.display();
		
		
	}
}
