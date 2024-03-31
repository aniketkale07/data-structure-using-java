//Singly-Linked List
//A singlyLinked lsit is a fundamental data structure in computer science, representing a collection
//of node where each node contains data and a reference to the next node in the sequence..
//Each Node contains 2 parts .  data and reference to, the next node

/*OUTPUT:- 
 * List Before the Adding the new element
61 --> 7 --> 23 --> 6 --> 9 --> 12 --> END
--------------------------------
List After the Adding the new Element in the List
61 --> 7 --> 23 --> 6 --> 9 --> 12 --> 99 --> END
--------------------------------


The given Element is found at: 3

--------------------------------

33 --> 61 --> 7 --> 23 --> 6 --> 9 --> 12 --> 99 --> END
--------------------------------

After deleting the first element on an Linked List
61 --> 7 --> 23 --> 6 --> 9 --> 12 --> 99 --> END
--------------------------------

List After Deleting the Last Node
61 --> 7 --> 23 --> 6 --> 9 --> 12 --> END
 * 
 */

class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor for size of Singly Linked List
    public SinglyLinkedList(int size) {
        this.size = size;
    }

    // Default Constructor
    public SinglyLinkedList() {
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Insert the linked list element
    public void insertFirstElement(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
            size += 1;
        }

    }

    // Print the singlyLinked List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    // Add new Element at the last of the List
    public void addLastElement(int val) {
        Node node = new Node(val);
        if (tail == null) {
            // if tail ==Null it means list is empty
            // then the value of head and tail wil remain
            // same to head=tail=node
            head = tail = node;
        } else {
            tail.next = node; // otherwise set node to the next fo tail
            tail = node; // fine, node will be the last element in the list so, put the tail=node
        }
    }

    // Add the Element at the First Position of an list
    private void addFirst(int val) {
        Node node = new Node(val);
        if (node != null) {
            node.next = head;
            head = node;
        }

    }

    // Find the Given element Serarching the list
    private void findElement(int val) {
        Node node = head;
        boolean result = false;
        int index = 0;
        while (node != null) {

            if (node.value == val) {
                result = true;
                break;
            } else {
                node = node.next;
                index++;
            }
        }
        if (result == false) {
            System.out.println("\nThe given element is not Found..");
        } else {
            System.out.println("\nThe given Element is found at: " + index);
        }

    }

    // Delete the First element in list
    private void deleteFirst() {
        if (head != null) {
            head = head.next;
            size--;
        }

        if (head == null) { // check whether after deletion first element
            tail = null;
        }
    }

    // Delete the last element
    private void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = tail = null;
        } else {
            Node node = head;
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
            tail = node;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirstElement(12);
        list.insertFirstElement(9);
        list.insertFirstElement(6);
        list.insertFirstElement(23);
        list.insertFirstElement(7);
        list.insertFirstElement(61);

        // Add new Element at the end of List
        // print the list before the adding the new element?
        System.out.println("List Before the Adding the new element");
        list.printList();
     
        list.addLastElement(99);
        System.out.println("List After the Adding the new Element in the List");
        list.printList();

        // Search the specifc ELment in the list
        System.out.println("\n--------------------------------");
        System.err.println();
        list.findElement(6);


        //Add the Element to the First Position
        System.out.println("\n--------------------------------");
        list.addFirst(33);
        System.out.println();
        list.printList();

        // Delete the First Element in the Linked List
        System.out.println("\n--------------------------------");
        list.deleteFirst();
        System.out.println("\nAfter deleting the first element on an Linked List");
        list.printList();

        // Delete the Last Element in linked_list.
        System.out.println("\n--------------------------------");
        list.deleteLast();
        System.out.println("\nList After Deleting the Last Node");
        list.printList();

    }

}
