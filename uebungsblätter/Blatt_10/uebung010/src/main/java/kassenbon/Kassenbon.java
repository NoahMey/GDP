package kassenbon;
import java.util.ArrayList;

public class Kassenbon {
    
    ArrayList <Artikel> itemList = new ArrayList<>();
    Adresse adresse;
    public Kassenbon(Adresse address){
        this.adresse = address;
    }


    public ArrayList add(Artikel artikel){
        itemList.add(artikel);
        return itemList;
    }

    public void print(){

        adresse.print();

        // for(Artikel artikel : itemList){
        //     artikel.print();
        // }
    }
    
}
