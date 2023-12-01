package fraction;

public class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Erstellt eine neue instanz von Fraction mit gegebenem
     * zähler (numerator) und nenner (denominator)
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Addiert den Bruch other zu diesem Bruch dazu.
     */
    void plus(Fraction other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
    }

    /**
     * Subtrahiert den Bruch other von diesem Bruch.
     */
    void minus(Fraction other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
    }

    /**
     * Multipliziert den Burch other mit diesem Bruch
     */
    public void times(Fraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
    }

    /**
     * Dividiert den Burch other mit diesem Bruch
     */
    public void divBy(Fraction other) {
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
    }


    /**
     * Kürzt den Bruch
     */
    protected void reduce() {
        // Ihr Code
    }


    public boolean equals(Object other) {
        if (!(other instanceof Fraction)) {
            return false;
        }
        Fraction otherFraction = (Fraction) other;
        return this.numerator == otherFraction.numerator
            && this.denominator == otherFraction.denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        // Ihr eigener testcode
        Fraction f = new Fraction(6, 3);
        f.reduce();
        System.out.println(f);
    }

}
