package gol;

/**
 * Interface that defines a save access to the field, no matter if the accessed field is outside.
 */
public interface SaveAccess {
    /**
     * Access the field at a specific location which might be also outside of the field.
     * @param field The field that will be accessed.
     * @param row The row that should be accessed, but might be outside of the field.
     * @param col The column that should be accessed, but might be outside of the field.
     * @return Returns the value of the field.
     */
    boolean get(Field field, int row, int col);
}
