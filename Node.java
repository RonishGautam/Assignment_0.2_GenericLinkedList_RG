public class Node<T> {//<T> The type of data the node will hold.
    T data;/** The data held by the node. */
    Node<T> nextNode;/** The next node in the linked list. */

    public Node() {
        nextNode = null;
        data = null;
    }
  //Initializes a new node with the given data and no next node.

    public Node(T data) {
        this.data = data;
        nextNode = null;
    }
   // Sets the data for this node.
    public void setData(T data) {
        this.data = data;
    }
    //Returns the data held by this node.

    public T getData() {
        return this.data;
    }
    //Returns the next node after this node in the linked list.

    public Node<T> getNextNode() {
        return this.nextNode;
    }
    //Sets the next node after this node in the linked list.

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
