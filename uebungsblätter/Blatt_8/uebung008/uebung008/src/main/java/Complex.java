class Complex {

    double real;
    double imag;

    /**
     * Erstellt eine neue Komplexe Zahl mit gegebenem
     * Real- und imaginärteil.
     */
    Complex(double real, double imag) {
        // TODO Ihre Implementation
        this.real = real;
        this.imag = imag;
    }

    /**
     * Addiert die Komplexe Zahl other mit der durch dieses
     * Objekt repräsentierte komplexen Zahl und gibt das Ergebnis
     * als neue Komplexe Zahl zahl zurück.
     */
    public Complex add(Complex other) {
        Complex result = new Complex (other.real +real, other.imag +imag);
        // TODO Ihre Implementation (done)
        return (result);
    }

    /* Addiert die Komplexe Zahl other mit der durch dieses
    * Objekt repräsentierte komplexen Zahl. Durch diese
    * Operation soll das akutelle Objekt der addition beider
    * Zahlen entsprechen.
    */
    public void addInplace(Complex other) {
        // TODO Ihre Implementation (done)
        real += other.real;
        imag += other.imag;
    }

    /**
     * Multipliziert die Komplexe Zahl other mit der durch dieses
     * Objekt repräsentierte komplexen Zahl und gibt das Ergebnis
     * als neue Komplexe Zahl zahl zurück.
     */
    Complex multiply(Complex other) {
        // TODO Ihre Implementation (done)
        return (new Complex (((other.real *real)-(other.imag*imag)), ((other.real*imag) + (other.imag *real))));
    }

    /* Multipliziert die Komplexe Zahl other mit der durch dieses
    * Objekt repräsentierte komplexen Zahl. Durch diese
    * Operation soll das akutelle Objekt der Multiplikation beider
    * Zahlen entsprechen.
    */
    void multiplyInplace(Complex other) {
        // TODO Ihre Implementation (done)
        double newReal = ((other.real *real)-(other.imag*imag));
        double newImag =  ((other.real*imag) + (other.imag *real));
        real = newReal;
        imag = newImag;
    }


    /**
     * Gibt den Absolutwert der komplexen Zahl zurück
     */
    public double abs() {
        double result = Math.sqrt((Math.pow(real, 2) + Math.pow(imag, 2)));
        return result;
    }



    // public static void main(String[]args){
    //     Complex nc = new Complex(1, 2);
    //     Complex nc2 = new Complex(2, 4);
    //     nc.multiplyInplace(nc2);
    //     System.out.println(nc.imag);
    //     System.out.println(nc.abs());
    // }
}
