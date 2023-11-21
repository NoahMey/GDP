class Point {

    double x;
    double y;


    /**
     * Erzeugt ein neues Objekt mit den Koordinaten x und y
     */
    Point(double x, double y) {
        this.x = x;
        this.y = y;
        // TODO - Ihre Implementation
    }

    /**
     * Gibt die x-Koordinate zurück
     */
    double getX() {
        // TODO - Ihre Implementation
        return x;
    }

    /**
     * Gibt die y-Koordinate zurück
     */
    double getY() {
        // TODO - Ihre Implementation
        return y;
    }

    public static void main(String[] args) {
        // hier können Sie ihren eigenen Testcode schreiben.
        Point P1 = new Point(1, 2);
        System.out.println(P1.x);
    }

}
