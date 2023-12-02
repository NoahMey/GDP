package gol;


import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;


public class RuleTest {

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
    public void countNeighboursTestCircularRule() {
        resetAndInitializeField();
        CircularBoundaryRule rule = new CircularBoundaryRule();

        assertEquals(rule.countNeighbours(field, 5, 5), 2);
        assertEquals(rule.countNeighbours(field, 1, 9), 1);
    }
    @Test
    public void countNeighboursTestAliveRule() {
        resetAndInitializeField();
        AliveBoundaryRule rule = new AliveBoundaryRule();

        assertEquals(rule.countNeighbours(field, 5, 5), 2);
        assertEquals(rule.countNeighbours(field, 1, 9), 3);
    }

    @Test
    public void testWillBeAliveCircularRule() {
        resetAndInitializeField();
        CircularBoundaryRule rule = new CircularBoundaryRule();

        assertTrue(rule.willBeAlive(field, 5, 5));
        assertFalse(rule.willBeAlive(field, 1, 9));
        assertFalse(rule.willBeAlive(field, 2, 8));
    }
    @Test
    public void testWillBeAliveAliveRule() {
        resetAndInitializeField();
        AliveBoundaryRule rule = new AliveBoundaryRule();

        assertTrue(rule.willBeAlive(field, 5, 5));
        assertTrue(rule.willBeAlive(field, 1, 9));
        assertFalse(rule.willBeAlive(field, 2, 8));
    }
    */
}