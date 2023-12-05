package gol;

public class CircularBoundaryRule extends Rules {

    @Override
    public boolean get(Field field, int row, int col) {
        int width = field.getWidth()-1;
        int height = field.getHeight()-1; // -1 because index is asked
        col = col%height;
        row = row%width;
        if (row < 0) {
            row = width+row+1;
        }
        if (col < 0) {
            col = height+col+1;
        }
        return  field.isAlive(row, col);
    }
}
