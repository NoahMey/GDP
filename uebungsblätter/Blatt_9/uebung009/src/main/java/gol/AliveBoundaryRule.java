package gol;

public class AliveBoundaryRule extends CircularBoundaryRule  {
    
    
    // Es gibt keine Werte auserhalb des gültigen Bereiches, da CircularBoundaryRule automatisch in gültigen Bereich verschiebt.
    // public boolean willBeAlive(Field field, int row, int col) {
    //     if (row < 0 || row >= field.getWidth() || col < 0 || col >= field.getHeight()) {
    //         return  true;
    //     }
    //     return willBeAlive(field, row, col);
    // }
}
