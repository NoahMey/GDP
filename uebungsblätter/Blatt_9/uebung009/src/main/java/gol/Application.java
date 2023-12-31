package gol;

/**
 * Runs a game of live simulation.
 */
public class Application {
    /**
     * Main program that creates a game of life simulation.
     * 
     * It should iterate the simulation for a given number of iterations
     * and print the field each time.
     */
    public static void main(String[] args) {
        MyGameOfLife testField = new MyGameOfLife();
        for (int iterations = 0; iterations < 10; iterations++) {
            testField.print();
            System.out.println();
            testField.evolve();
        }

    }
}
