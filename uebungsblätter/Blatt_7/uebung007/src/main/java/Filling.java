import static ch.unibas.informatik.jturtle.TurtleCommands.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Filling {
    Point lowerLeftCorner;
    double width;
    double height;

    /**
     * Kreiert ein neues Rectangle Objekt, welches ein Rechteck durch den
     * unteren Linken Punkt, sowie dessen Breite und Höhe definiert.
     */
    Filling(Point lowerLeftCorner, double width, double height) {
        // TODO - Ihre Implementation
        this.lowerLeftCorner = lowerLeftCorner;
        this.width = width;
        this.height = height;
    }

    /*
     * Zeichnet das Rechteck mit gegebener Breite und Höhe an der angegebenen Position
     * Nutzen Sie die Methode TurtleUtils.setTurtlePosition um die Position vom Turtle
     * zu setzen.
     */
    void draw() {
        // TODO - Ihre Implementation
        TurtleUtils.setTurtlePosition(lowerLeftCorner); 
        penUp();
        turnRight(90);
        forward(width/2);
        turnLeft(90);
        forward(height/2);
        penDown();
        if(height < 10){
            penColor(YELLOW);
            fill();      
        }
        if((height > 10) && (height < 30)){
            penColor(ORANGE);
            fill();      
        }
        if((height > 30) && (height < 60)){
            penColor(RED);
            fill();      
        }
        if((height > 60) && (height < 80)){
            penColor(GREY);
            fill();      
        }
        fill();      
        reset();
    }

    /**
     * Einfaches Testprogramm um Ihre Zeichnung zu testen
     */
    public static void main(String[] args) {
        clear();
        Filling rect = new Filling(new Point(-30, -50),20, 100);
        rect.draw();

        BufferedImage img  = drawing();

        try {
            ImageIO.write(img, "png", new java.io.File("rectangle.png"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
