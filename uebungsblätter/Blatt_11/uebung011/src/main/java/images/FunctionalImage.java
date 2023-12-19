package images;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class FunctionalImage {

    /**
     * Auflösung des Bilds
     */
    private static final int IMAGE_WIDTH = 512;
    private static final int IMAGE_HEIGHT = 512;

    /**
     * Grösse des Bilds (also die Domain der Funktion welches die Bildwerte
     * definiert.)
     */
    private static final double WIDTH = 2;
    private static final double HEIGHT = 2;

    /**
     * Funktion, welche für jeden Punkt entweder True oder False zurückgibt, und
     * somit bestimmt ob das Bild an dem Punkt Schwarz oder Weiss ist.
     */
    private Function<Point, Boolean> imageFunction;

    /**
     * Kreiert ein neues Bild, mit gegebenem Prädikat
     */
    public FunctionalImage(Function<Point, Boolean> imageFunction) {
        this.imageFunction = imageFunction;
    }

    /**
     * Wertet das Bild an einem bestimmten Punkt aus.
     */
    public boolean apply(Point p) {
        return this.imageFunction.apply(p);
    }

    /**
     * Rendert das von diesem Objekt repräsentierte Bild und schreibt es in die
     * angegebene Datei.
     */
    void render(File file) throws IOException {
        BufferedImage image = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, TYPE_INT_RGB);
        for (int i = 0; i < IMAGE_WIDTH; i++) {
            for (int j = 0; j < IMAGE_HEIGHT; j++) {
                boolean isBlack = this.apply(new Point(i * WIDTH / (double) IMAGE_WIDTH - WIDTH / 2.0,
                        j * HEIGHT / (double) IMAGE_HEIGHT - HEIGHT / 2.0));
                if (isBlack) {
                    image.setRGB(i, j, Color.BLACK.getRGB());
                } else {
                    image.setRGB(i, j, Color.WHITE.getRGB());
                }
            }
        }
        ImageIO.write(image, "png", file);

    }

    /**
     * Kreiert ein neues Bild, welches einen vertikalen schwarzen Streifen in
     * der Mitte des Bildes zeigt (siehe Übungsblatt)
     */
    public static FunctionalImage createStrip() {
        return new FunctionalImage(p -> Math.abs(p.x) < 0.5);
    }

    /**
     * Erzeugt ein neues Bild durch hintereinanderausführung (Komposition)
     * der Funktion die das Bild repräsentiert und der übergebenen Funktion.
     */
    public FunctionalImage compose(Function<Point, Point> before) {
        return new FunctionalImage(p -> this.apply(before.apply(p)));
    }

    /**
     * Erzeugt eine Funktion, welche jeden Punkt um den Winkel theta rotiert.
     */
    public static Function<Point, Point> rotate(double theta) {
        return p -> new Point(p.x*Math.cos(theta) - p.y * Math.sin(theta),
                             p.y * Math.cos(theta)+ p.x * Math.sin(theta)); //formel auf Blatt
    }

    /**
     * Erzeugt eine "swirl" Transformation. Detaillierte Formel siehe Übungsblatt.
     */
    public static Function<Point, Point> swirl(double r) {
        return p -> rotate(p.distOrigin() * 2 * Math.PI/r).apply(p);
    }

    public static void main(String[] args) {

        try {

            createStrip()
                    .compose(rotate(Math.PI / 4))
                    .compose(swirl(1))
                    .render(new File("image.png"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
