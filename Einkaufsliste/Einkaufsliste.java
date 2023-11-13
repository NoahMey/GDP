public class Einkaufsliste {
    String name;
    double price;

    public Einkaufsliste(String name, double price){
        this.name = name;
        this.price = price;
    }

    public static void main(String[]args) {
     Einkaufsliste entry1 = new Einkaufsliste("Kartoffel", 1.5);
     System.out.println(entry1.name);
    
}}
