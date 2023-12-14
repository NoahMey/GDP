package list;

/**
 * Ein Knoten in der verketteten Liste
 */
class Node {

    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

}

/**
 * Einfache Implementation einer verketteten Liste
 */
public class LinkedList {
    private Node head;
    private Node tail;

    /**
     * Fügt ein neues Element mit dem übergebenen Wert am Ende der Liste hinzu.
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    /**
     * Entfernt das erste Element in der Liste und gibt dessen Wert zurück.
     * ACHTUNG!!!  Passen Sie die Methodensignatur entsprechend Ihren Bedürfnissen an.
     */
    public int removeFirst() {

        // Ihre Implementation
        return 0;
    }

    /**
     * Löscht alle Elemente in der Liste. Dabei soll die Methode removeFirst genutzt
     * werden.
     */
    public void removeAll() {

        // Ihre Implementation
    }

    /**
     * Gibt die Anzahl Elemente in der Liste zurück
     */
    public int getSize() {
        if (head == null) {
            return 0;
        }

        int n = 0;
        Node currentNode = head;
        while (currentNode != null) {
            n = n + 1;
            currentNode = currentNode.next;
        }
        return n;
    }

    /**
     * Gibt die Elemente der Liste auf die Konsole aus.
     */
    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(5);
        ll.print();
        ll.removeAll();
        ll.print();
    }
}
