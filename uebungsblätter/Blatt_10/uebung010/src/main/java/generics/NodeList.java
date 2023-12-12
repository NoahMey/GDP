package generics;

public class NodeList<T extends Comparable<T>> {

    Node<T> firstElement;

    public NodeList() {
        firstElement = null;
    }

    public Node<T> getLastNode() {
        Node<T> currentNode = firstElement;
        //in case the nodelist is empty
        if (currentNode == null) {
            return null;
        }
        //while not pointer to next element = null= go further in the path, else give the node with node.givnextnode = null.
        while (currentNode.giveNextNode() != null) {
            currentNode = currentNode.giveNextNode();
        }
        return currentNode;
    }
    //adds a nodeto the last position, meaning where pointer is null set to the new node. if the list is empty, we initialize the first element to be the new node.
    public void addNode(T something) {
        Node<T> newNode = new Node<T>(something, null);
        if (firstElement == null) {
            firstElement = newNode;
        } else {
            getLastNode().setNextNode(newNode);
        }

    }

    public void printLinkedList(){
        Node<T> currentNode = firstElement;
        //in case the nodelist is empty, print empty
        if (currentNode == null) {
            System.out.println("The linked List is empty");
        }
        //while not pointer to next element = null= go further in the path, else give the node with node.givnextnode = null.
        while (currentNode != null) {
            System.out.println(currentNode.content);
            currentNode = currentNode.giveNextNode();
        }
        return;
    }

}
