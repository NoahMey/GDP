package fraction;

public class ReducedFraction extends Fraction {

    /**
     * Erstellt eine neue instanz von einem korrekt
     * gekürzten Bruch mit gegebenem
     * zähler (numerator) und nenner (denominator).
     *
     * Beispiel: ReducedFraction(4, 6) ergibt 1/3
     */
    public ReducedFraction(int numerator, int denominator) {
        super(numerator, denominator);

        this.reduce(); //ich will auf dem objekt arbeiten, welches hier gearbeitet wurde. Deshalb this. Aber geht auch ohne
        
        
    }

    // Ihr Code


    public static void main(String[] args) {
      System.out.println(ReducedFraction(6, 3));
    }
}
