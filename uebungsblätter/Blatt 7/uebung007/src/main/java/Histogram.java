class Histogram {

    // Felder um die Daten sowie die Anzahl Bins zu speichern
    double[] data = null;
    int numberOfBins;

    /**
     * Erzeugt ein Histogram Objekt für die übergebenen Gleitkommazahlen (daten),
     * mit den angegebenen anzahl Klassen (bins).
     * Die Daten sollen in einem Feld data und die anzahl Klassen in einem Feld
     * numberOfBins gespeichert werden.
     */
    Histogram(double[] data, int numberOfBins) {
        this.data = data;
        this.numberOfBins = numberOfBins;
    }

    /**
     * Gibt die Anzahl Klassen (bins) zurück
     */
    int getNumberOfBins() {
        return this.numberOfBins;
    }

    /*
     * gibt die im Histogram gespeicherten Daten zurück
     */
    double[] getData() {
        return this.data;
    }

    /**
     * Gibt den kleinsten Wert in den Daten zurück
     */
    public double getMinValue() {
        // TODO - Ihre Implementation
        return 0.0;
    }

    /**
     * Gibt den grössten Wert in den Daten zurück
     */
    public double getMaxValue() {
        // TODO - Ihre Implementation
        return 0.0;
    }

    /**
     * Gibt die Grösse einer Klasse (also das Interval zurück). Die Intervallgrösse
     * berechnet sich als (max - min) / #bins, wobei max der Maximalwert in den
     * Daten ist,  min der MinimalWert und #bins die Anzahl klassen.
     */
    public double getBinSize() {
        // TODO - Ihre Implementation;
        return 0.0;
    }

    /**
     * Gibt für eine gegebene Klasse (bestimmt durch binNumber) die Anzahl
     * Datenelemente zurück die in diese Klasse fallen. Wir beginnen bei 0 zu zählen.
     * Das erste Bin hat also den index 0. Der grösste Wert fällt in den letzten Bin
     *
     * Beispiel:
     * Angenommen wir hätten die Daten [4.1, 1.5, 5.0, 1.0, 3.0, 3.5, 4.0, 3.1]
     * und 4 bins. Dann wäre
     * getNumberOfEntriesInBin(0) = 2  (nämlich 1.0 und 1.5)
     * getNumberOfEntriesInBin(1) = 0
     * getNumberOfEntriesInBin(2) = 3  (nämlich 3.0, 3.1, 3.5)
     * getNumberOfEntriesInBin(3) = 3  (nämlich 4.0, 4.1, 5.0)
     *
     * Beachten Sie, dass das letzte Bin speziell behandelt werden muss, da es
     * zusätzlich auch das maximale Element beinhaltet
     */
    public int getNumberOfEntriesInBin(int binNumber) {
        // TODO - Ihre Implementation
        return 0;
    }


    public static void main(String[] args) {
        // hier können Sie ihren eigenen Testcode schreiben.
    }

}
