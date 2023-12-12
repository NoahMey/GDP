package generics;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        NodeList<Integer> testLinked = new NodeList<>();
        testLinked.addNode(42);
        testLinked.addNode(11);
        testLinked.addNode(23);
        //testLinked.printLinkedList();
        SortedList<Integer> sorList = new SortedList<>(testLinked); //Eig. bräuchte ich hier erst generics mit comparable, da ich hier erst sortieren möchte.
        sorList.insert(12);
        sorList.print();
        //System.out.println(sorList.getSize());
        
    }
}
