import java.util.Arrays;

/**
 * Implementation einer Klasse Stack mit fixer Kapazitat. 
 * Die in der Stack gespeicherten Elemente sind vom Typ Integer.
 */
public class Stack {

    // In diesem Array sollen die Elemente im Stack gespeichert werden
<<<<<<< HEAD
    Integer[] data = null; 
    int size = 0;
=======
    Integer[] data;
    int entrys = 0;
>>>>>>> 96ff0a4dd87c5bb5963d097d89f4c210633f283b

    // TODO fügen Sie hier weitere Felder hinzu, die Sie brauchen um den Stack zu implementieren


    /**
     * Kreiert einen neuen Stack mit der angegebenen Kapazität
     */
    public Stack(int capacity) {
<<<<<<< HEAD
        // TODO Ihre Implementation
        Integer[] data = new Integer[capacity];
=======
        // TODO Ihre Implementation (done)
        data = new Integer[capacity];
>>>>>>> 96ff0a4dd87c5bb5963d097d89f4c210633f283b
    }

    /**
     * Fügt ein neues Element hinzu, falls es noch Platz
     * im Stack gibt. Gibt True zurück falls das Element
     * hinzugefügt werden konnte, ansonsten false.
     */
    boolean push(Integer element) {
<<<<<<< HEAD
        // TODO Ihre Implementation
        if (size < data.length){
            data[size] = element;
            size += 1;
=======
        // TODO Ihre Implementation (done)
        if (entrys < data.length) {
            data[entrys] = element;
            entrys += 1;
>>>>>>> 96ff0a4dd87c5bb5963d097d89f4c210633f283b
            return true;
        }
        return false;
    }

    /**
     * Gibt das zuletzt hinzugefügte Element zurück. Falls der Stack leer ist wird
     * null zurückgegeben
     */
    Integer pop() {
<<<<<<< HEAD
        // TODO Ihre Implementation
        if(size == 0){
            return null;
        }
        return data[size];
=======
        // TODO Ihre Implementation (done)
        if (entrys == 0) {
            return null;
        }
        int delInt = data[entrys-1];
        data[entrys-1] = null;
        entrys -= 1;
        return delInt;
        
>>>>>>> 96ff0a4dd87c5bb5963d097d89f4c210633f283b
    }

    /**
     * Gibt die Anzahl Elemente zurück die im Stack gespeichert
     * sind.
     */
    int size() {
<<<<<<< HEAD
        // TODO Ihre Implementation
        return size;
=======
        // TODO Ihre Implementation (done)
        return entrys;
>>>>>>> 96ff0a4dd87c5bb5963d097d89f4c210633f283b
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
<<<<<<< HEAD
         Stack stack = new Stack(17);
            for (int i = 0; i < 17; i = i + 1) {
                stack.push(Integer.valueOf(i));
            }
        System.out.println(stack.toString());
=======
         Stack stack = new Stack(4);
         System.out.println(stack.size());
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(stack.push(Integer.valueOf(i)));
        }
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(stack.pop());
            System.out.println(stack.size());
        }
        
            

>>>>>>> 96ff0a4dd87c5bb5963d097d89f4c210633f283b
    }

}
