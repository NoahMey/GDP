package gol;

/**
 * The interface of a field.
 */
public interface Field {
    
    /**
     * Returns if a cell at a specified position is alive or not.
     */
    public boolean isAlive(int row, int col);

    /**
     * Set a cell as alive at a given position.
     */
    public void setAlive(int row, int col);

    /**
     * Set a cell as not alive at a given position.
     */
    public void setNotAlive(int row, int col);

    /**
     * Returns the with of the field.
     */
    public int getWidth();

    /**
     * Returns the height of the field.
     */
    public int getHeight();

    /**
     * Prints a field.
     */
    default public void print() {
        // TODO: implement the function
        for (int col = 0; col< getHeight(); col++){
            String result = "";
            for(int row = 0; row <getWidth(); row++){
                if (isAlive(row, col)) {
                    result += "@";
                }
                else{
                    result += ".";
                }
            }
            System.out.println(result);            
        }
        System.out.println();
        
    }
}
