package gol;


import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;


public class GameOfLifeTest {

    BooleanField field;

    GameOfLife game;

    public void resetAndInitializeField() {
        game = new GameOfLife() {
            @Override
            public Rules createRules() {
                return new CircularBoundaryRule();
            }

            @Override
            public Field createField() {
                return new BooleanField(10, 10);
            }

            @Override
            public void init(Field field) {
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
        };

    }


    @Test
    public void constructorTest() {
        MyGameOfLife game = new MyGameOfLife();

        assertNotNull(game.createField());
        assertNotNull(game.createRules());

        assertNotNull(game.getField());
        assertNotNull(game.getRules());


    }

    @Test
    public void testEvolve() {
        resetAndInitializeField();
        game.evolve();

        assertTrue(game.getField().isAlive(5, 5));
        assertFalse(game.getField().isAlive(1, 9));



    }
 
}
