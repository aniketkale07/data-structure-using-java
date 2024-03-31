//Insert the element at index value using recursion function
/*OUTPUT;
8 --> 77 --> 55 --> 33 --> 14 --> 44 --> END       
After insertion at index 2:
8 --> 77 --> 65 --> 55 --> 33 --> 14 --> 44 --> END
 * 
 */

public class RecursiveInsertion {

    private Node head;
    private int size;

    public RecursiveInsertion() {
        this.size = 0;
        this.head = null;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        RecursiveInsertion list = new RecursiveInsertion();
        list.insertElement(44);
        list.insertElement(14);
        list.insertElement(33);
        list.insertElement(55);
        list.insertElement(77);
        list.insertElement(8);

        // Display the list
        list.display();

        // Insert at index 2
        list.insertAtIndex(65, 2);

        // Display the modified list
        System.out.println("\nAfter insertion at index 2:");
        list.display();
    }

    public void insertAtIndex(int value, int index) {
        // Check whether the index is not below than 0
        if (index < 0) return;
        head = recursiveIndex(value, index, head);
    }

    // Recursive function for insertion at index
    private Node recursiveIndex(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        if (node.next != null) {
            node.next = recursiveIndex(value, --index, node.next);
        }

        return node;
    }

    private void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " --> ");
            node = node.next;
        }
        System.out.print("END");
    }

    private void insertElement(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }
}
