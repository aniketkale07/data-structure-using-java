//DoublyLinked List
// A doubly linked List is type of linked list in which each node contains a data element
// and two pointers, one is pointing to next element and second one is in previous element

/*OUTPUT: -
 * 
 * 
Priting Forwrad List     30 <--> 20 <--> 10 <-->  END

--------------------------------
Printing Reverse List    10 <--> 20 <--> 30 <-->  END

--------------------------------
After Deleting First Element    20 <--> 10 <-->  END

--------------------------------
After Deleting Last Element     20 <-->  END

 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;

            this.prev = null;
            this.next = null;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    void insertElement(int val) {
        Node node = new Node(val);
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = node;
            tail = node;
        } else {
            // Update pointers for a non-empty list
            head.prev = node;
            node.prev = null;
            node.next = head;
            head = node;
            // tail=node.next;
        }
        size++;
    }

    // You can add other methods for traversing, deleting, etc.

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertElement(10);
        list.insertElement(20);
        list.insertElement(30);

        // Print the list (you may want to implement a printList method)
        System.out.print("\nPriting Forwrad List \t ");
        list.displayList();

        // Print the list in reverse Order
        System.out.println("\n--------------------------------");

        System.out.print("Printing Reverse List \t ");
        list.displayListReverse();

        // Delete the First Element in DDL
        System.out.println("\n--------------------------------");
        System.out.print("After Deleting First Element\t");
        list.deleteFirstElement();
        list.displayList();

        // Delete the last Element in and DDL
        System.out.println("\n--------------------------------");
        System.out.print("After Deleting Last Element\t");
        list.deleteLastElement();
        list.displayList();
    }

    // Display the DLL
    private void displayList() {
        Node node = head;
        if (node == null) {
            System.out.println("THe List is Empty..");
        }
        while (node != null) {
            System.out.print(node.value + " <--> ");
            node = node.next;
        }
        System.out.print(" END\n");
    }

    // Display the DLL Reverse.
    private void displayListReverse() {
        Node node = tail;
        if (node == null) {
            System.out.println("THe list is empty");
        }
        while (node != null) {
            System.out.print(node.value + " <--> ");
            node = node.prev;
        }
        System.out.print(" END\n");
    }

    // Delete the First Element form the DLL

    private void deleteFirstElement() {
        if (head == null) {
            return;
        }
        if (head == tail) { // if the list having only one element
            head = null;
            tail = null;
        }
        head.next.prev = null;
        head = head.next;

        size--;
    }

    // Delete the Last Element from the DDL
    private void deleteLastElement() {
        if (head == null) {
            // List is empty, nothing to delete
            return;
        }

        if (head == tail) {
            // Only one element in the list
            head = null;
            tail = null;
        } else {
            // Move tail to the previous node and disconnect it from the last node
            tail = tail.prev;
            tail.next = null;
        }

        size--; // Decrease the size of the list
    }

    // Traversal on DLL
    void findElement(int val) {
        Node node = new Node(val);
    //check whether the list is empty or not
    if(head==null){
        System.out.println("The List is Empty..");
        return;
    }
}

    
}
