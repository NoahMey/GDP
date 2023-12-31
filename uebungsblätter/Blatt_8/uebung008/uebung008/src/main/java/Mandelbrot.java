import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Dieses Objekt fast alle Relevanten Daten zu einer Berechnung vom
 * der Mandelbrotmenge.
 */
class MandelbrotResult {

    int maxIterations;
    int numberOfIterationsUntilEscaped;
    Complex number;

    /**
     * Kreiert ein neues MandelbrotResult. Es werden folgende Daten gespeichert:
     * - maximalen Anzahl Iterationen (maxIterations),
     * - Fluchtgeschwindigkeit (numberOfIterationsUntilEscaped),
     * - die aus der berechneten Folge resultierende Komplexe Zahl (number)
     */
    MandelbrotResult(int maxIterations, int numberOfIterationsComputed, Complex number) {
        this.maxIterations = maxIterations;
        this.numberOfIterationsUntilEscaped = numberOfIterationsComputed;
        this.number = number;
    }

    /**
     * Gibt an ob die Folge konvergiert ist
     */
    boolean hasEscaped() {
        return numberOfIterationsUntilEscaped < maxIterations;
    }
}

/**
 * Diese Klasse enthält Methoden zur Berechnung und Visualisierung
 * der Mandelbrotmenge.
 */
class Mandelbrot {

    // Grösse des Bild, das visualisiert wird
    static final int IMAGE_WIDTH =  600;
    static final int IMAGE_HEIGHT = 600;

    // Felder die zur Visualisierung verwendet werden.
    BufferedImage image =  new BufferedImage(
        IMAGE_WIDTH,
        IMAGE_HEIGHT,
        BufferedImage.TYPE_INT_ARGB
    );


    /**
     * Speichert das erzeugte Bild unter angegebenem Dateinamen
     */
    public void save(String filename) {
        try {
            ImageIO.write(this.image, "png", new java.io.File(filename));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Setzt Pixel mit index (i, j) auf die angegebene Farbe
     */
    private void setPixel(int i, int j, java.awt.Color color) {
        image.setRGB(i, j, color.getRGB());
    }

    /**
     * Berechnet die Mandelbrot-folge c_1, ... c_n, für eine gegebene Komplexe Zahl c.
     * Die Folge wird berechnet bis entweder abs(c_i) > 2 gilt oder die Anzahl
     * iterationen erreicht wurde.
     */
    MandelbrotResult computeMandelbrot(Complex c, int maxIterations) {
        int iteration = 0;
        Complex z = new Complex(0, 0); // erstes Z = 0;
        while ((z.abs() < 2)&& (iteration < maxIterations)) {
            z = z.multiply(z);
            z = z.add(c); 
            iteration += 1;
        }
        MandelbrotResult result = new MandelbrotResult(maxIterations, iteration, z);
        // TODO Ihre Implementation (done)
        return (result);

    }

    /**
     * Wandelt ein pixel index gegeben durch i und j in eine Komplexe Zahl um.
     * Dabei soll der realanteil i * scaling + panX sein und der
     * Imaginäranteil j * scaling + panY.
     */
    Complex pixelPosToComplexNumber(int i, int j, double scaling, double panX, double panY) {
        // TODO Ihre Implementation (done)
        Complex result = new Complex(i*scaling+panX, j*scaling+panY);

        return result;

    }

    /**
     * Kreiert eine Visualisierung der Mandelbrotmenge. Dabei werden alle Pixel des
     * Bildes this.image entsprechend dem Resultat der Mehode computeMandelBrot
     * eingefärbt.
     * Die jeweilige Bildkoordinate wird mit der Methode pixelPosToComplexNumber in
     * eine Komplexe Zahl umgewandet.
     *
     * Zur visualisieren werden die Methoden setPixel und ColorPalette.getColor benutzt.
     *
     */
    void createMandelbrotVisualization(double scaling,
                                      double panX, double panY, int maxIterations) {
        for(int i = 0; i < IMAGE_WIDTH; i++){
            for(int j = 0; j < IMAGE_HEIGHT; j++){
                // TODO Ihre Implementation (done)
                //setPixel(i, j, ColorPalette.getColor(computeMandelbrot(pixelPosToComplexNumber(i, j, scaling, panX, panY), maxIterations))); (für farbigen Aufruf)
                setPixel(i, j, ColorPalette.colorToGreyscale(ColorPalette.getColor(computeMandelbrot(pixelPosToComplexNumber(i, j, scaling, panX, panY), maxIterations))));
            }
        }
    }


    public static void main(String[] args) {
        Mandelbrot mb = new Mandelbrot();
        mb.createMandelbrotVisualization(
            0.004,
            -1.7,
            -1.2,
            100
        );
        mb.save("mandelbrot.png");
    }
}
