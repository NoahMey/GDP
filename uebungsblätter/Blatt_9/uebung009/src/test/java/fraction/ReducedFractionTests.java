package fraction;

import org.junit.Test;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ReducedFractionTests {

    @Test(timeout = 1000)
    public void testInheritanceAndConstructor() {
        testIsInstanceInheritsFromFraction();
        testConstructorReducesFraction();
    }

    @Test
    public void testIsInstanceInheritsFromFraction() {
        ReducedFraction f = new ReducedFraction(2, 3);
        assertTrue(f instanceof Fraction);

    }

    @Test
    public void testConstructorReducesFraction() {
        ReducedFraction f = new ReducedFraction(4, 6);
        assertEquals(f, new ReducedFraction(2, 3));
    }

    @Test(timeout = 1000)
    public void testOperations() {
        testPlus();
        testMinus();
        testDivBy();
        testTimes();
    }

    @Test
    public void testPlus() {
        ReducedFraction f = new ReducedFraction(2, 3);
        callOperation("plus", f, new ReducedFraction(2, 4));
        assertEquals(new ReducedFraction(7, 6), f);
    }

    @Test
    public void testMinus() {
        ReducedFraction f = new ReducedFraction(6, 8);
        callOperation("minus", f, new ReducedFraction(1, 2));

        assertEquals(new ReducedFraction(2, 8), f);
    }

    @Test
    public void testTimes() {
        ReducedFraction f = new ReducedFraction(2, 8);
        callOperation("times", f, new ReducedFraction(3, 4));

        assertEquals(new ReducedFraction(3, 16), f);
    }

    @Test
    public void testDivBy() {
        ReducedFraction f = new ReducedFraction(7, 8);
        callOperation("divBy", f, new ReducedFraction(7, 8));
        assertEquals(new ReducedFraction(1, 1), f);
    }

    private void callOperation(String operationName, ReducedFraction obj, Fraction param) {
        try {
            Class cls = Class.forName(ReducedFraction.class.getName());

            // call the printIt method
            Class[] cArg = {Class.forName(Fraction.class.getName())};
            Method method = cls.getDeclaredMethod(operationName, cArg);
            method.invoke(obj, param);
        } catch (ClassNotFoundException e) {
            fail("Class" + ReducedFraction.class.getName() + " not available");
        } catch (NoSuchMethodException e) {
            fail("Could not find method " + operationName);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
