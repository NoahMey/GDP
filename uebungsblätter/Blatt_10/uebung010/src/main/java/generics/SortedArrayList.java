package generics;
import java.util.*;

public class SortedArrayList <T extends Comparable<T>>{

    T[] testlist;
    int size;
    public SortedArrayList(T[] testlist){
        this.size = testlist.length;
        this.testlist = sortiere(testlist);
        
    }

    public T[] sortiere(T[] testlist){
        T[] nl = testlist;
        T curMin = testlist[0];
        T maxV = testlist[0];
        for(T element: testlist){
                if (curMin.compareTo(element) > 0) {
                    maxV = element;
                }
            }
        for (int nlIndex= 0; nlIndex < size; nlIndex++ ){
            int currentIndex = 0;
            int replaceIndex = 0;
            for(; replaceIndex < size; replaceIndex++){
                if (curMin.compareTo(testlist[replaceIndex]) < 0) {
                    curMin = testlist[replaceIndex];
                    currentIndex = replaceIndex;
                }
            }
            nl[nlIndex] = curMin;
            testlist[currentIndex] = maxV;
        }
        return nl;
    }

    public T get(int index){
        try {
            return testlist[index];
        } catch (Exception e) {
            System.err.println(e);
        }
        return null; //weshalb muss ich dies tun?
    }

}
// Hier kommt Ihre Implementation der Klasse SortedList hin