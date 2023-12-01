package gol;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;


public class AliveBoundaryRuleTest {

    /*
    BooleanField field;

    public void resetAndInitializeField() {
        field = new BooleanField(10, 10);
        Random random = new Random();
        random.setSeed(1700335721671l);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (random.nextDouble() < 0.3) {
                    field.setAlive(i, j);
                }
            }
        }
    }

    @Test
    public void testCircularBoundaryRules() {
        resetAndInitializeField();
        AliveBoundaryRule rule = new AliveBoundaryRule();
        // teste normalen zugriff
        System.out.println(field.isAlive(5, 5));
        System.out.println(rule.get(field, 5, 5));

        assertEquals(field.isAlive(5, 5), rule.get(field, 5, 5));
        assertEquals(field.isAlive(1, 9), rule.get(field, 1, 9));


        // teste zyklischen zugriff (negativ)
        assertTrue(rule.get(field, -5, -5));
        assertTrue(rule.get(field, -9, -1));


        // teste zyklischen zugriff (positiv)
        assertTrue(rule.get(field, 15, 15));
        assertTrue(rule.get(field, 11, 19));

    }
    */
}
