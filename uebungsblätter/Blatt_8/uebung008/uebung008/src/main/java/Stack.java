import java.util.Arrays;

/**
 * Implementation einer Klasse Stack mit fixer Kapazitat. 
 * Die in der Stack gespeicherten Elemente sind vom Typ Integer.
 */
public class Stack {

    // In diesem Array sollen die Elemente im Stack gespeichert werden
    Integer[] data;
    int entrys = 0; //atribut der Klasse

    // TODO fügen Sie hier weitere Felder hinzu, die Sie brauchen um den Stack zu implementieren


    /**
     * Kreiert einen neuen Stack mit der angegebenen Kapazität
     */
    public Stack(int capacity) {
        // TODO Ihre Implementation (done)
        data = new Integer[capacity];
    }

    /**
     * Fügt ein neues Element hinzu, falls es noch Platz
     * im Stack gibt. Gibt True zurück falls das Element
     * hinzugefügt werden konnte, ansonsten false.
     */
    boolean push(Integer element) {
        // TODO Ihre Implementation (done)
        if (entrys < data.length) {
            data[entrys] = element;
            entrys += 1;
            return true;
        }
        return false;
    }

    /**
     * Gibt das zuletzt hinzugefügte Element zurück. Falls der Stack leer ist wird
     * null zurückgegeben
     */
    Integer pop() {
        // TODO Ihre Implementation (done)
        if (entrys <= 0) {
            return null;
        }
        int delInt = data[entrys-1];
        entrys -= 1;
        data[entrys] = null;
        return delInt;
        
    }

    /**
     * Gibt die Anzahl Elemente zurück die im Stack gespeichert
     * sind.
     */
    int size() {
        // TODO Ihre Implementation (done)
        return entrys;
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
         Stack stack = new Stack(4);
         System.out.println(stack.size());
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(stack.push(Integer.valueOf(i)));
        }
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(stack.pop());
            System.out.println(stack.size());
        }
        
            

    }

}
