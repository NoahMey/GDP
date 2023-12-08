package gol;

public class CircularBoundaryRule extends Rules {

    @Override
    public boolean get(Field field, int row, int col) {
        int width = field.getWidth();
        int height = field.getHeight(); // -1 because index is asked
        col = col%width;
        row = row%height;
        if (row < 0) {
            row = width+row;
        }
        if (col < 0) {
            col = height+col;
        }
        return  field.isAlive(row, col);
    }
}
