package generics;

public class Node<T extends Comparable<T>> {

    Node<T> nextNode;
    T content;
    public Node(T content, Node<T> nextNode){
        this.content = content;
        this.nextNode = nextNode;
    }

    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }

    public T getValue(){
        return this.content;
    }

    public Node<T> giveNextNode(){
        return this.nextNode;
    }


    
}
