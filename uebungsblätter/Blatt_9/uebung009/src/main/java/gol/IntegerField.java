package gol;

class IntegerField implements Field {

    int[][] intField;
    
    public IntegerField(int height, int width){
        intField = new int[height][width];
    }

    @Override
    public int isAlive(int row, int col) {
        return intField[row][col];
    }

    @Override
    public void setAlive(int row, int col) {
        intField[row][col] = 1;
    }

    @Override
    public void setNotAlive(int row, int col) {
        intField[row][col] = 0;
    }

    @Override
    public int getWidth() {
        return intField.length;

    }

    @Override
    public int getHeight() {
        return intField[0].length;
    }

    
}

    


