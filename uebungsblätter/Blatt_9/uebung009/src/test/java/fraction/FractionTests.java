package fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FractionTests {

    @Test(timeout = 1000)
    public void testReduceFraction() {
        testReduceFractionPositive();
        testReduceFractionNegative();
    }

    @Test
    public void testReduceFractionPositive() {

        Fraction f = new Fraction(2, 2);
        f.reduce();
        assertEquals(new Fraction(1, 1), f);

        f = new Fraction(1, 2);
        f.reduce();
        assertEquals(new Fraction(1, 2), f);

        f = new Fraction(4, 8);
        f.reduce();
        assertEquals(new Fraction(1, 2), f);

        f = new Fraction(10, 6);
        f.reduce();
        assertEquals(new Fraction(5, 3), f);

        f = new Fraction(1010, 606);
        f.reduce();
        assertEquals(new Fraction(5, 3), f);
    }

    @Test
    public void testReduceFractionNegative() {
        Fraction f = new Fraction(-2, 4);
        f.reduce();
        assertEquals(new Fraction(-1, 2), f);

        f = new Fraction(-12, 4);
        f.reduce();
        assertEquals(new Fraction(-3, 1), f);

        f = new Fraction(6, -14);
        f.reduce();
        assertTrue((new Fraction(-3, 7)).equals(f) || (new Fraction(3, -7).equals(f)));

        f = new Fraction(-6, -14);
        f.reduce();
        assertTrue((new Fraction(-3, -7)).equals(f) || (new Fraction(3, 7).equals(f)));
    }

}
