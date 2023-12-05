package gol;

class BooleanField implements Field {

    boolean[][] booleanField = null;
    
    public BooleanField(int height, int width){
        booleanField = new boolean[height][width];
    }

    @Override
    public boolean isAlive(int row, int col) {
        return booleanField[row][col];
    }

    @Override
    public void setAlive(int row, int col) {
        booleanField[row][col] = true;
    }

    @Override
    public void setNotAlive(int row, int col) {
        booleanField[row][col] = false;
    }

    @Override
    public int getWidth() {
        return booleanField.length;

    }

    @Override
    public int getHeight() {
        return booleanField[0].length;
    }

    
}
