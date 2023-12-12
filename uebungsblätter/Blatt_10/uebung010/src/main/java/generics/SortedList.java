package generics;

/**
 * SortedVerketteteListe
 */
public class SortedList<T extends Comparable<T>> {

    NodeList<T> linkedList;
    int size;

    public SortedList(NodeList<T> linkedList) {
        this.linkedList = linkedList;
    }

    public int getSize() { // size importieren von linked list
        int size = 0; // oder 1 wenn es um anzahl elemente geht, hier index.
        Node<T> currNode = linkedList.firstElement;
        while (currNode.nextNode != null) {
            size += 1;
            currNode = currNode.nextNode;
        }
        return size;
    }

    public Node<T> getSmallestNode() {
        Node<T> currNode = linkedList.firstElement;
        Node<T> currSmallestNode = linkedList.firstElement;
        while (currNode != null) {
            if (currSmallestNode.content.compareTo(currNode.content) > 0) {
                currSmallestNode = currNode;
                
            }
            currNode = currNode.giveNextNode();
        }
        return currSmallestNode;
    }

    public Node<T> getBNode() {
        Node<T> currNode = linkedList.firstElement;
        Node<T> currBNode = linkedList.firstElement;
        while (currNode != null) {
            if (currBNode.content.compareTo(currNode.content) < 0) {
                currBNode = currNode;
                
            }
            currNode = currNode.giveNextNode();
        }
        return currBNode;
    }

    public NodeList<T> sortier() {
        NodeList<T> sortedList = new NodeList<T>();
        SortedList<T> copyLinkedList = this; //lol
        // Node<T> currNode = linkedList.firstElement;
        // Node<T> smallesNode = linkedList.firstElement;
        // int currentPos = 0;
        T maxV = this.getBNode().content;

        for (int x = 0; x < this.getSize(); x++) {
            sortedList.addNode(copyLinkedList.getSmallestNode().content);
            System.out.println("copyLinkedList.getSmallestNode().content");
            copyLinkedList.getSmallestNode().content = maxV;

        }
        sortedList.printLinkedList();
        // copyLinkedList.linkedList.printLinkedList();
        return sortedList;
    }

}