package generics;

/**
 * SortedVerketteteListe
 */
public class SortedList<T extends Comparable<T>> {

    NodeList<T> linkedList;
    int size;
    public SortedList(NodeList<T> linkedList){
        this.linkedList = linkedList;
    }

    public int getSize(){ // size importieren von linked list
        int size = 0; // oder 1 wenn es um anzahl elemente geht, hier index.
        Node<T> currNode= linkedList.firstElement;
        while(currNode.nextNode != null){
            size +=1;
            currNode = currNode.nextNode;
        }
        return size;
    }


}