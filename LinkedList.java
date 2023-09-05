//<T> The type of data the linked list will hold.

public class LinkedList<T> {

    /** The first node in the linked list. */
    private Node<T> head;

    /** The number of nodes in the linked list. */
    private int length;

    /** The last node in the linked list. */
    private Node<T> tail;

   
    public LinkedList() {
        head = null;
        length = 0;
        tail = head;
    }

    //Checks if the linked list is empty.
    
    public boolean isEmpty() {
        return head == null;
    }

    // return The head node.
    public Node<T> getHead() {
        return head;
    }

    /**
     * Adds a new node with the given data to the end of the linked list.
     */
    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        length++;
    }
}
