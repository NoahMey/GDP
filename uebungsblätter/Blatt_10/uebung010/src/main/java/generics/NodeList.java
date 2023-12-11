package generics;

public class NodeList<T extends Comparable<T>> {
    
    Node<T> firstElement;

    public NodeList(){
        firstElement = null;
    }

    public Node<T> getLastNode(){
        Node<T> currentNode = firstElement;
        while(currentNode.giveNextNode() != null){
            currentNode = currentNode.giveNextNode();
        }
        return currentNode;
    }

    public void add(Node<T> newNode){
        //
    }


}
