import java.util.Arrays;

/**
 * Implementation einer Klasse Stack mit fixer Kapazitat. 
 * Die in der Stack gespeicherten Elemente sind vom Typ Integer.
 */
public class Stack {

    // In diesem Array sollen die Elemente im Stack gespeichert werden
    Integer[] data = null; 

    // TODO fügen Sie hier weitere Felder hinzu, die Sie brauchen um den Stack zu implementieren


    /**
     * Kreiert einen neuen Stack mit der angegebenen Kapazität
     */
    public Stack(int capacity) {
        // TODO Ihre Implementation
    }

    /**
     * Fügt ein neues Element hinzu, falls es noch Platz
     * im Stack gibt. Gibt True zurück falls das Element
     * hinzugefügt werden konnte, ansonsten false.
     */
    boolean push(Integer element) {
        // TODO Ihre Implementation
        return false;
    }

    /**
     * Gibt das zuletzt hinzugefügte Element zurück. Falls der Stack leer ist wird
     * null zurückgegeben
     */
    Integer pop() {
        // TODO Ihre Implementation
        return null;
    }

    /**
     * Gibt die Anzahl Elemente zurück die im Stack gespeichert
     * sind.
     */
    int size() {
        // TODO Ihre Implementation
        return 0;
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
        System.out.println(stack.toString());
    }

}
