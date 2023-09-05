public class Application {

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        myList.addNode(9);  // Directly adding data instead of Node
        myList.addNode(1);  // Corrected this line to add an integer directly
        myList.addNode(1);  // Corrected this line to add an integer directly

        Node<Integer> tempnode = myList.getHead(); //(tempnode) that starts at the beginning of the chain.
        while (tempnode != null) {
            // Show the current number.
            System.out.println(tempnode.getData());
            // Move to the next number in the chain.
            tempnode = tempnode.getNextNode();
        }

    }
}