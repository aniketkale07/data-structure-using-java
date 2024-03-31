//Circular Linked List
// last Node of list is pointed to back to the Head of the List
//Uses -: Where continuous rotation is needed..
//it having node head poiter to locate the next element in list

/* OUTPUT: -

Representation of Circular Linked List :
44--> 14--> 24--> 43--> HEAD
--------------------------------

Adding the new Element in list From HEAD:
55--> 44--> 14--> 24--> 43--> HEAD
--------------------------------

Adding the new Element in list From TEIL:
55--> 44--> 14--> 24--> 43--> 90--> HEAD
--------------------------------

After Deleting the First Element:
44--> 14--> 24--> 43--> 90--> HEAD

 * 
 */

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private class Node {
        int value;
        Node next;

        // Default Constructor
        public Node() {
        }

        //

        // Parameterized Constructor
        public Node(int value, CircularLinkedList.Node next) {
            this.value = value;
            this.next = null;
        }

        public Node(int value) {
            this.value = value;
        }

    }

    private void insertElement(int val) {
        Node node = new Node(val);
        if (head == null) { // for in DLL has no any element i.e node is the
            head = node; // is the first element in the list
            tail = node;
            return;
        }
        tail.next = node; // tail-->node
        node.next = head; // tail-->node-->head
        tail = node; // previousTail-->tail-->head
        size++;
    }

    // Display the CLL
    private void displayElement() {
        Node node = head;
        do {

            System.out.print(node.value + "--> ");
            node = node.next;
        } while (node != head);
        System.out.print("HEAD");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertElement(44);
        list.insertElement(14);
        list.insertElement(24);
        list.insertElement(43);

        // Display the CLL

        System.out.println("\nRepresentation of Circular Linked List : ");
        list.displayElement();

        // Add ELement in CLL Head
        System.out.println("\n--------------------------------");

        System.out.println("\nAdding the new Element in list From HEAD: ");
        list.addFirstElement(55);
        list.displayElement();

        // Add Element in CLL from the Tail
        System.out.println("\n--------------------------------");

        System.out.println("\nAdding the new Element in list From TEIL: ");
        list.addListElement(90);
        list.displayElement();

        System.out.println("\n--------------------------------");
        System.out.println("\nAfter Deleting the First Element: ");
        list.deleteFirst();
        list.displayElement();

    }

    // Add Element in CLL from the Tail
    private void addListElement(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node; // tail--> node
        node.next = head; // tail --> Node -->Head
        tail = node; // previous Tail --> Node -->Head
        size++;
    }

    // Add Element in CLL from the HEAD

    private void addFirstElement(int val) {
        Node node = new Node(val);
        if (head == null) { // Check whether the head is null
            head = tail = node;
            return;
        }
        tail.next = node; // tail --> Node
        node.next = head; // Tail --> Node --> Head
        head = node;
        size++;
    }

    // Delete ELement
    private void deleteFirst() {
        Node node = head;
        tail.next = head.next;
        head = head.next;
        size--;
    }
}
