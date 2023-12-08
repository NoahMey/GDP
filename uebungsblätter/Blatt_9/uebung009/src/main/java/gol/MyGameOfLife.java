package gol;

/**
 * MyGameOfLife
 */
public class MyGameOfLife extends GameOfLife {

    @Override
    public Rules createRules() {
        Rules theRules = new CircularBoundaryRule();
        //return new AliveBoundaryRule();
        return theRules;
    }

    @Override
    public Field createField() {
        Field theField = new BooleanField(20, 20);
        return theField;
    }

    @Override
    public void init(Field field) {
        for (int height = 0; height < field.getHeight(); height++) {
            for (int width = 0; width < field.getWidth(); width++) {
                double random = Math.random();
                if (random > 0.7) {
                    field.setAlive(height, width);
                } else {
                    field.setNotAlive(height, width);
                }
            }
        }
    }
}