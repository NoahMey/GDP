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
        
        double minV = data[0];
        for(double element : data){
            if (minV > element) {
                minV = element;
            }
        }
        return minV;
    }

    /**
     * Gibt den grössten Wert in den Daten zurück
     */
    public double getMaxValue() {
        
        double maxV = data[0];
        for(double element : data){
            if (maxV < element) {
                maxV = element;
            }
        }
        return maxV;
    }

    /**
     * Gibt die Grösse einer Klasse (also das Interval zurück). Die Intervallgrösse
     * berechnet sich als (max - min) / #bins, wobei max der Maximalwert in den
     * Daten ist,  min der MinimalWert und #bins die Anzahl klassen.
     */
    public double getBinSize() {
        return ((getMaxValue() - getMinValue())/numberOfBins);
    }

    /**
     * Gibt für eine gegebene Klasse (bestimmt durch binNumber) die Anzahl
     * Datenelemente zurück die in diese Klasse fallen. Wir beginnen bei 0 zu zählen.
     * Das erste Bin hat also den index 0. Der grösste Wert fällt in den letzten Bin
     *
     * Beispiel:
     * Angenommen wir hätten die Daten [4.1, 1.5, 5.0, 1.0, 3.0, 3.5, 4.0, 3.1]
     * und 4 bins. Dann wäre
     * getNumberOfEntriesInBin(0) = 2  (nämlich 1.0 und 1.5) from 1 to 2 because bin Size = 1 und min value = 1
     * getNumberOfEntriesInBin(1) = 0   from 2 to 3, because 2 = 
     * getNumberOfEntriesInBin(2) = 3  (nämlich 3.0, 3.1, 3.5)
     * getNumberOfEntriesInBin(3) = 3  (nämlich 4.0, 4.1, 5.0)
     *
     * Beachten Sie, dass das letzte Bin speziell behandelt werden muss, da es
     * zusätzlich auch das maximale Element beinhaltet
     */
    public int getNumberOfEntriesInBin(int binNumber) {
        int height = 0;
        double underBorder = getMinValue();
        double upperBorder = getMaxValue();
        for (double element : data){
            if ((element < underBorder + ((binNumber+1)*getBinSize())) & (element >= underBorder + ((binNumber)*getBinSize()))) {
                height += 1;
            }
        }
        if (upperBorder == (underBorder + ((binNumber+1)*getBinSize()))) {
            height += 1;
        }
        return height;
    }


    public static void main(String[] args) {
        // hier können Sie ihren eigenen Testcode schreiben.
        Histogram his = new Histogram(new double[]{4.1, 1.5, 5.0, 1.0, 3.0, 3.5, 4.0, 3.1}, 4);
        System.out.println(his.getNumberOfEntriesInBin(1));
    }

}
