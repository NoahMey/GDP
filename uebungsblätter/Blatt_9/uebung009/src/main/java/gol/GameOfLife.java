package gol;


/**
 * The game that knows how to evolve given the field and the rules.
 */
public abstract class GameOfLife {

    private Rules rules;
    private Field field;

    /**
     * Creates the rules, the field and initializes the field using the abstract methods.
     */
    public GameOfLife() {
        // TODO implement the function
        this.field = getField();
        this.rules = getRules();
        
    }

    /**
     * Creates rules, yet undefined.
     * @return Returns the rules that should be used.
     */
    abstract public Rules createRules();

    /**
     * Create a field, yet undefined.
     * @return Returns a newly created field.
     */
    abstract public Field createField();

    /**
     * Some way of initializing a field, yet undefined.
     * @param field Initializes the passed field.
     */
    abstract public void init(Field field);

    /**
     * Evolves the game by one iteration applying the rules.
     */
    public void evolve() {
        // TODO: implement the function
        Field newField = createField();
        this.field = newField;
        // Field nField = this.field;
        // for(int cols = 0; cols <= this.field.getHeight(); cols ++){
        //     for(int rows = 0; rows <= this.field.getWidth(); rows ++){
        //         if(this.rules.willBeAlive(field, rows, cols)){
        //             nField.setAlive(rows, cols);
        //         }
        //         else{
        //             nField.setNotAlive(rows, cols);
        //         }
        //     }
        // }
        // this.field = nField;
    }
    
    /**
     * Printing the game state just prints the field.
     */
    public void print() {
        // TODO: implement the function
        init(field);
    }

    /**
     * Accessor method for field
     */
    public Field getField() { return this.field; }

    /**
     * Accessor method for rules
    */
    public Rules getRules() { return this.rules; }
}
