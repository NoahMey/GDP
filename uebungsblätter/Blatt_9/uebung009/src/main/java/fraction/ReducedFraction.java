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

        reduce(); //ich will auf dem objekt arbeiten, welches hier erstellt wurde. Deshalb this. Aber geht auch ohne
        //this.reduce();
        
        
    }

    // Ihr Code


    public static void main(String[] args) {
      ReducedFraction rf = new ReducedFraction(-4,8);
      System.out.println(rf);
    }
}
