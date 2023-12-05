package gol;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerFieldTest {

    
    @Test
    public void testSetAlive() {
        IntegerField field = new IntegerField(10, 10);
        field.setAlive(5, 5);
        field.setAlive(1, 9);

        assertTrue(field.isAlive(5, 5));
        assertTrue(field.isAlive(1, 9));

        assertFalse(field.isAlive(2, 4));
        assertFalse(field.isAlive(1, 8));
    }

    @Test
    public void testSetNotAlive() {
        IntegerField field = new IntegerField(10, 10);
        field.setAlive(5, 5);
        field.setAlive(1, 9);

        field.setNotAlive(5, 5);
        field.setNotAlive(1, 9);

        assertFalse(field.isAlive(5, 5));
        assertFalse(field.isAlive(1, 9));

        assertFalse(field.isAlive(2, 4));
        assertFalse(field.isAlive(1, 8));
    }

    @Test
    public void isAliveTest() {
        IntegerField field = new IntegerField(10, 10);
        field.setAlive(5, 5);
        field.setAlive(1, 9);

        assertTrue(field.isAlive(5, 5));
        assertTrue(field.isAlive(1, 9));

        field.setNotAlive(5, 5);
        field.setNotAlive(1, 9);
        field.setNotAlive(2, 8);

        assertFalse(field.isAlive(5, 5));
        assertFalse(field.isAlive(1, 9));
        assertFalse(field.isAlive(2, 8));

    }
    

}
