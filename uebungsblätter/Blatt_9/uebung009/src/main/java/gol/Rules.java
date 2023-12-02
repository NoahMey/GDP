package gol;

/**
 * The ruls for the game of live.
 * 
 * The rules do not specify which boundary condtions should be applied, i.e. what
 * should happen when accessing cells outside the boundary.
 */
public abstract class Rules implements SaveAccess {

    /**
     * Counts the alive neighbours of the given cell by accesing cells unsing the get function.
     * @param field The field to work with
     * @param row The row index of the cell for which to count the neighbours.
     * @param col The column index of the cell for which to count the neighbours.
     * @return Returns the number of alive neighbours.
     */
    public int countNeighbours(Field field, int row, int col) {
        // TODO: implement the function
        return 0;
    }

    /**
     * Returns if the cell will be alive in the next generation or not.
     * @param field The field to work with.
     * @param row The row index of the cell.
     * @param col The column index of the cell.
     * @return Returns if the cell will be alive in the next generation.
     */
    public boolean willBeAlive(Field field, int row, int col) {
        // TODO: implement the function
        return false;
    }
    
}
