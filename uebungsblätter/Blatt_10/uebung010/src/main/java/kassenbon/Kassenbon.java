package kassenbon;

import java.util.ArrayList;

public class Kassenbon {

    ArrayList<Artikel> itemList = new ArrayList<Artikel>();
    Adresse adresse;

    public Kassenbon(Adresse address) {
        this.adresse = address;
    }

    public ArrayList<Artikel> add(Artikel artikel) {
        itemList.add(artikel);
        return itemList;
    }

    void separator(int width) {
        String printString = "|";
        for (int x = 0; x < width-2; x++) { // -2, da noch | jeweils
            printString += "=";
        }
        printString += "|";
        System.out.println(printString);
    }

    public void print() {
        int width = 30;
        separator(width);
        adresse.print();
        separator(width);
        kassenbon.Artikel.print(itemList);
    }
}
