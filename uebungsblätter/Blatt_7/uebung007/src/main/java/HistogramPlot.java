import static ch.unibas.informatik.jturtle.TurtleCommands.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

class HistogramPlot {

    Histogram histogram = null;

    static final double PLOT_WIDTH = 100;
    static final double PLOT_HEIGHT = 100;
    static final Point LOWER_LEFT_CORNER_POINT = new Point(-50, -50);

    /**
     * Kreiert ein neues HistogramPlot Objekt, welches ein Histogram
     * mit numberOfBin Klassen der gegebenen Daten repräsentiert,
     */
    HistogramPlot(double[] data, int numberOfBins) {
        this.histogram = new Histogram(data, numberOfBins);
    }


    /**
     * Diese Methode nutzt ein gegebenes Turtle Objekt um das Histogram zu zeichnen.
     * Dabei sollen die Klassen PlotAxes und Rectangle benutzt werden um die einzelnen
     * Elemente zu zeichnen. Die Länge und Breite der Achsen ist dabei durch die
     * vordefinierten Konstanten PLOT_WIDTH und PLOT_HEIGHT festgelegt.
     * Die Breite jedes Balkens soll entsprechend der Anzahl Klassen im Histogram
     * festgelegt werden.
     * Die Höhe des Balkens soll proportional zu den Anzahl Einträgen in jeder Histogram
     * Klasse sein. Dabei soll der höchste Balken genau der Höhe des Plots (PLOT_HEIGHT)
     * entsprechen.
     *
     */
    void draw() {
        //Drag X,Y-Axis
        PlotAxes pA = new PlotAxes(LOWER_LEFT_CORNER_POINT, PLOT_WIDTH, PLOT_HEIGHT);
        pA.draw();

        //creates double array of heights
        double barWidth = PLOT_WIDTH/histogram.getNumberOfBins();
        double[] heights = new double[histogram.getNumberOfBins()];
        for(int binIndex = 0; binIndex < histogram.getNumberOfBins(); binIndex++){
             heights[binIndex] = histogram.getNumberOfEntriesInBin(binIndex);
        }
        Histogram heightHist = new Histogram(heights, histogram.getNumberOfBins());
        double scaleFactor = PLOT_HEIGHT/heightHist.getMaxValue(); //plotheight = maxV * scalef

        //draws rectangeles
        for(int bars = 0; bars < histogram.getNumberOfBins(); bars++){
            Point LLC = new Point((LOWER_LEFT_CORNER_POINT.getX() +(bars*barWidth)), LOWER_LEFT_CORNER_POINT.getY());
            Rectangle rect = new Rectangle(LLC, barWidth, heights[bars]*scaleFactor);
            rect.draw();
        }

        //fill histogram with color
        for(int bars = 0; bars < histogram.getNumberOfBins(); bars++){
            Point LLC = new Point((LOWER_LEFT_CORNER_POINT.getX() +(bars*barWidth)), LOWER_LEFT_CORNER_POINT.getY());
            Filling filler = new Filling(LLC, barWidth, heights[bars]*scaleFactor);
            filler.draw();
        }
    }

    /**
     * Kreiert und speichert ein Bild des Histogramplots unter angegebenem Dateinamen.
     */
    void saveToImage(String filename) {

        this.draw();
        BufferedImage img  = drawing();

        try {
            ImageIO.write(img, "png", new java.io.File(filename));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        home();
        clear();

        // Einfacher Testcode. Gut zum Debuggen
        double[] simpleData = {1, 2, 2.1, 2, 4, 2.3, 4.1, 4.2, 3, 4, 4.1, 7, 7.1};  
        HistogramPlot simplePlot = new HistogramPlot(simpleData, 7);
        simplePlot.saveToImage("./histogram-simple.png");

        home();
        clear();

        // // Etwas komplexerer Testcase. Hier wird ein Zufallsgenerator
        // // genutzt um 1000 Normalverteilte Zufallszahlen zu generieren.
        java.util.Random rng = new java.util.Random(42);
        double[] normalData = new double[1000];
        for (int i = 0; i < normalData.length; i++) {
            normalData[i] = rng.nextGaussian();
        }
        HistogramPlot normalPlot = new HistogramPlot(normalData, 30);
        normalPlot.saveToImage("./histogram-normal.png");
    }
}
