package generics;

/**
 * SortedVerketteteListe
 */
public class SortedList<T extends Comparable<T>> extends NodeList<T> {

    NodeList<T> linkedList;
    int size;
    public SortedList(NodeList<T> linkedList) {
        this.linkedList = linkedList;

        // this.linkedList = sortier(); erster versuch automatisch die linkedList zu sortieren beim konstruieren.


        // NodeList<T> sortedLinkedList = sortier(); zweiter Versuch automatisch die linkedList zu sortieren beim Konstruieren
        // this.linkedList = sortedLinkedList;

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

        // this.printLinkedList();
        // System.out.println("L1");

        NodeList<T> sortedList = new NodeList<T>();
        SortedList<T> copyLinkedList = this; //lol
        T maxV = this.getBNode().content;
        for (int x = 0; x <= this.getSize(); x++) {
            sortedList.addNode(copyLinkedList.getSmallestNode().content);
            copyLinkedList.getSmallestNode().content = maxV;
        }
        return sortedList;
        
    }

}