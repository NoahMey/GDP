import java.util.Arrays;

/**
 * Implementation einer Klasse Stack mit fixer Kapazitat. 
 * Die in der Stack gespeicherten Elemente sind vom Typ Integer.
 */
public class Stack {

    // In diesem Array sollen die Elemente im Stack gespeichert werden
    Integer[] data;
    int size = 0;

    // TODO fügen Sie hier weitere Felder hinzu, die Sie brauchen um den Stack zu implementieren


    /**
     * Kreiert einen neuen Stack mit der angegebenen Kapazität
     */
    public Stack(int capacity) {
        // TODO Ihre Implementation
        data = new Integer[capacity];
    }

    /**
     * Fügt ein neues Element hinzu, falls es noch Platz
     * im Stack gibt. Gibt True zurück falls das Element
     * hinzugefügt werden konnte, ansonsten false.
     */
    boolean push(Integer element) {
        // TODO Ihre Implementation
        if(size < data.length){
            data[size] = element;
            size += 1;
            return true;
        }
        return false;
    }

    /**
     * Gibt das zuletzt hinzugefügte Element zurück. Falls der Stack leer ist wird
     * null zurückgegeben
     */
    Integer pop() {
        // TODO Ihre Implementation
        if (size == 0) {
            return null;
        }
        return data[size-1];
    }

    /**
     * Gibt die Anzahl Elemente zurück die im Stack gespeichert
     * sind.
     */
    int size() {
        // TODO Ihre Implementation
        return size;
    }

    /**
     * Gibt den Inhalt des Stacks aus.
     */
    @Override 
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size()));
    }

    public static void main(String[] args) {

         // Schreiben Sie hier ihre eigenen Testprogramme
         Stack stack = new Stack(17);
            for (int i = 0; i < 17; i = i + 1) {
                stack.push(Integer.valueOf(i));
            }

        Stack stack2 = new Stack(10);
        
        for (int i = 0; i<6; i = i+2){
            stack2.push(i);
        }
        System.out.println(stack2.push(42));
        System.out.println(stack2.pop());
        System.out.println(stack2.toString());
        System.out.println(stack2.size());
    }

}
