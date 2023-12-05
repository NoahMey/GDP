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
    super(numerator, denominator); // ruft Konstruktor von Fraction auf.
    super.reduce();

  }

  @Override
  void minus(Fraction other){ 
    super.minus(other);
    reduce();
  }

  @Override
  void plus(Fraction other) {
    super.plus(other);
    reduce();
  }

  @Override
  public void divBy(Fraction other){
    super.divBy(other);
    reduce();
  }

  @Override
  public void times(Fraction other){
    super.times(other);
    reduce();
  }

  public static void main(String[] args) {
    ReducedFraction rf = new ReducedFraction(4, 2);
    // System.out.println(rf);
    ReducedFraction nf = new ReducedFraction(2, 2);
    rf.minus(nf); // was will ich mehr?
    System.out.println(rf);

  }
}
