package linkedListQuestions;

public class InsertUsingRecursion {

    private Node head;
    private int size;

    public InsertUsingRecursion() {
        this.size = 0;
    }

    private class Node {
        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // MAIN CODE
    private Node InsertRec(int val, int index, Node node) {

        // Reached the required location
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        // Recursive call
        node.next = InsertRec(val, index - 1, node.next);

        return node;
    }

    public void InsertRec(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        head = InsertRec(val, index, head);
    }

    
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public int getSize() {
        return size;
    }
    
    
    public static void main(String[] args) {

        InsertUsingRecursion list = new InsertUsingRecursion();

        // Test 1: Insert at index 0
        list.InsertRec(10, 0);
        list.display();

        // Test 2: Insert at index 1
        list.InsertRec(20, 1);
        list.display();

        // Test 3: Insert at index 1 (middle)
        list.InsertRec(15, 1);
        list.display();

        // Test 4: Insert at the beginning
        list.InsertRec(5, 0);
        list.display();

        // Test 5: Insert at the end
        list.InsertRec(30, list.getSize());
        list.display();

        System.out.println("Size: " + list.getSize());
    }
}