package kassenbon;

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

    public void print(){
        String printString = "";
        printString += (String.format("%-15S", this.item));
        printString += String.format("%2.0f x %5.2f", this.quantity, this.price);
        printString += "\n";
        printString += String.format("%30.2f", this.price*this.quantity);
        System.out.println(printString);
    }
}
