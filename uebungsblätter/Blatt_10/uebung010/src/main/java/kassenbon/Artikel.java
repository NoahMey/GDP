package kassenbon;
import java.util.ArrayList;

public class Artikel {

    String item;
    double quantity;
    double price;

    public Artikel(String item, double quantity, double price){
        this.price = price;
        this.quantity = quantity;
        this.item = item;
    }

    public double getPrice(){
        return this.quantity * this.price;
    }

    public static void print(ArrayList <Artikel>Artikellist){
        String printString = "\n";
        double total = 0.0; 
        for(Artikel artikel : Artikellist){
            printString += (String.format("%-15S", artikel.item));
            printString += String.format("%2.0f x %5.2f", artikel.quantity, artikel.price);
            printString += "\n";
            printString += String.format("%30.2f", artikel.getPrice());
            printString += "\n";
            total += artikel.getPrice();
        }
        System.out.println(printString);
        System.out.println("------------------------------");
        System.out.println(String.format("Total%25.2f", total));
        System.out.println("==============================");

    }
}
