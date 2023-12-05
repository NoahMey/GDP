package gol;

public class AliveBoundaryRule  {
    
    public boolean willBeAlive(Field field, int row, int col) {
        if (row < 0 || row >= field.getWidth() || col < 0 || col >= field.getHeight()) {
            return  true;
        }
        return willBeAlive(field, row, col);
    }
}
