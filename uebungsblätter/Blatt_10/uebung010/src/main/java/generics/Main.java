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
        System.out.println(sorList.getSize());
        sorList.sortier().printLinkedList();

        
        
        
        
        
        // int len = 6;
        // Integer[] testArray = new Integer[len];
        // for(int index = 0; index < len/2; index++){
        //     testArray[index] = index;
        // }
        
        // for(int index = len-1; index > len/2; index--){
        //     testArray[index] = index-len/2;
        // }

        // for (int num : testArray) {
        //     System.out.print(num + " ");
        // }

        // SortedList <Integer> sortlist = new SortedList<>(testArray);
        // for(int index = 0; index < sortlist.size; index++){
        //     System.out.println(sortlist.get(index));
        // }
        
    }
}
